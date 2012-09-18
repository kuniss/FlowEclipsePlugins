package de.grammarcraft.flow.jvmmodel
 
import com.google.inject.Inject
import org.eclipse.xtext.common.types.JvmDeclaredType
import org.eclipse.xtext.util.IAcceptor
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import de.grammarcraft.flow.flow.Model
import de.grammarcraft.flow.flow.EbcOperation
import de.grammarcraft.flow.flow.MethodOperation
import de.grammarcraft.flow.flow.Flow
import com.sun.org.apache.bcel.internal.generic.MethodObserver

/**
 * <p>Infers a JVM model from the source model.</p> 
 *
 * <p>The JVM model should contain all elements that would appear in the Java code 
 * which is generated from the source model. Other models link against the JVM model rather than the source model.</p>     
 */
class FlowJvmModelInferrer extends AbstractModelInferrer {

    /**
     * conveninence API to build and initialize JvmTypes and their members.
     */
	@Inject extension JvmTypesBuilder

	/**
	 * Is called for each instance of the first argument's type contained in a resource.
	 * 
	 * @param element - the model to create one or more JvmDeclaredTypes from.
	 * @param acceptor - each created JvmDeclaredType without a container should be passed to the acceptor in order get attached to the
	 *                   current resource.
	 * @param isPreLinkingPhase - whether the method is called in a pre linking phase, i.e. when the global index isn't fully updated. You
	 *        must not rely on linking using the index if iPrelinkingPhase is <code>true</code>
	 */
   	def dispatch void infer(Model model, IAcceptor<JvmDeclaredType> acceptor, boolean isPrelinkingPhase) {
   
   		
    acceptor.accept(model.toClass(model.name + ".flow") [
      documentation = model.documentation
      members += model.toMethod("main", model.newTypeRef("void")) [
      		setStatic(true)
      		body = ['''
        				«FOR functionUnit:model.functionUnits»
        					«IF functionUnit instanceof Flow»
        						«val flow = functionUnit as Flow»
        						a «flow.name» flow defintion comes here
«««		       	 				«FOR stream:flow.streams»
«««		       	 					«determinePortName(stream.leftPort)»,«determinePortName(stream.rightPort)»
«««	        					«ENDFOR»
   	     					«ENDIF»
        					«IF functionUnit instanceof EbcOperation»
        						«val op = functionUnit as EbcOperation»
        						a «op.name» ebc defintion comes here
   	     					«ENDIF»
        					«IF functionUnit instanceof MethodOperation»
        						«val op = functionUnit as MethodOperation»
        						a «op.name» method defintion comes here
   	     					«ENDIF»
        				«ENDFOR»
      		'''	
      		]
//	      	for (functionUnit: model.functionUnits) {
//	        switch functionUnit {
//	          Flow : {
//	   					it.body = ['''
//	   						String a = "flow «functionUnit.name»";
//	   					''']
//	          }
//	          EbcOperation : {
//	   					it.body = ['''
//	   						String b = "ebc «functionUnit.name»";
//	   					''']
//	          }
//	          MethodOperation : {
//	   					it.body = ['''
//	   						String c = "method «functionUnit.name»";
//	   					''']
//	          }
//	        }
//	      }
      ]
    ])
   		// Here you explain how your model is mapped to Java elements, by writing the actual translation code.
   		// An example based on the initial hellow world example could look like this:
   		
//   		acceptor.accept(element.toClass("my.company.greeting.MyGreetings") [
//   			for (greeting : element.greetings) {
//   				members += greeting.toMethod(greeting.name, greeting.newTypeRef(typeof(String))) [
//   					it.body ['''
//   						return "Hello «greeting.name»";
//   					''']
//   				]
//   			}
//   		])
   	}
}
