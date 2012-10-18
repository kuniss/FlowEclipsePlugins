/*
 * generated by Xtext
 */
package de.grammarcraft.csflow.generator

import de.grammarcraft.csflow.flow.EbcOperation
import de.grammarcraft.csflow.flow.Flow
import de.grammarcraft.csflow.flow.GenericType
import de.grammarcraft.csflow.flow.GlobalInputPort
import de.grammarcraft.csflow.flow.GlobalOutputPort
import de.grammarcraft.csflow.flow.LeftPort
import de.grammarcraft.csflow.flow.MethodOperation
import de.grammarcraft.csflow.flow.Model
import de.grammarcraft.csflow.flow.Operation
import de.grammarcraft.csflow.flow.OperationTypeParameters
import de.grammarcraft.csflow.flow.Port
import de.grammarcraft.csflow.flow.RightPort
import de.grammarcraft.csflow.flow.UnnamedSubFlowPort
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import de.grammarcraft.csflow.flow.TypeParameter
import de.grammarcraft.csflow.flow.Type
import de.grammarcraft.csflow.flow.ClassOperation

class FlowGenerator implements IGenerator {
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		val model = resource.contents.head as Model
		fsa.generateFile(model.name + ".cs", model.compile)
	}
	
	def compile(Model model) ''' 
			namespace �model.name� {
				static void Main(string[] args)
				{
					var config = new FlowRuntimeConfiguration();
					
					// registration of streams
					config.AddStreamsFrom(@"/
						�FOR functionUnit:model.functionUnits�
							�IF functionUnit instanceof Flow�
								�val flow = functionUnit as Flow�
								// �flow.name� flow definition comes here
								�flow.name�
								�FOR stream:flow.streams�
									�stream.leftPort.determinePortName�,�stream.rightPort.determinePortName�
								�ENDFOR�
							�ENDIF�
						�ENDFOR�
					");
					
					// registration of operations
					config
						�FOR functionUnit:model.functionUnits�
							�IF functionUnit instanceof Operation�
								�val operation = functionUnit as Operation�
								�operation.synthesizeRegistration�
							�ENDIF�
						�ENDFOR�
				}
			}
	'''
	
	def determinePortName(LeftPort leftPort) {
		switch leftPort {
			Port case leftPort.port!=null: '''�leftPort.functionUnit.name�.�leftPort.port.name�'''
			Port: '''�leftPort.functionUnit.name�'''
			UnnamedSubFlowPort: "."
			GlobalInputPort: ".in"
			default: "[unknown port type]"
		}
	}

	def determinePortName(RightPort rightPort) {
		switch rightPort {
			Port case rightPort.port!=null: '''�rightPort.functionUnit.name�.�rightPort.port.name�'''
			Port: '''�rightPort.functionUnit.name�'''
			UnnamedSubFlowPort: "."
			GlobalOutputPort: ".out"
			default: "[unknown port type]"
		}
	}
	
	def synthesizeRegistration(Operation operation) {
		switch operation {
			EbcOperation: operation.synthesizeRegistration
			MethodOperation: operation.synthesizeRegistration
			ClassOperation: operation.synthesizeRegistration
			default: "[unknown operation type]"
		}
	}
	

	def synthesizeRegistration(ClassOperation classOperation) {
		'''.addOperation(new �classOperation.class_.reference�())'''
	}
		
	
	def synthesizeRegistration(EbcOperation ebcOperation) {
		'''.addEventBasedComponent("�ebcOperation.name�", new �ebcOperation.class_.reference�())'''
	}
	
	
	def synthesizeRegistration(MethodOperation methodOperation) {
		'''.add�methodOperation.signature.type.synthesizeRegistration�("�methodOperation.name�", �methodOperation.class_.reference�.�methodOperation.method.name�)'''	
	}
	
	def synthesizeRegistration(GenericType genericType) {
		switch genericType.operationType.name {
			case 'Action': 
				'''Action�genericType.operationTypeParameters?.synthesizeRegistration�'''
			case 'Func': 
				'''Func�genericType.operationTypeParameters?.synthesizeRegistration�'''
			default:
				'''[unknown operation type �genericType.operationType.name�]'''
		}
	}
	
	def synthesizeRegistration(OperationTypeParameters typeParameters) {
		'''<�typeParameters.typeParameter.synthesizeRegistration��FOR typeParameter:typeParameters.typeParameters�,�typeParameter?.typeParameter.synthesizeRegistration��ENDFOR�>'''
	}
	
	def synthesizeRegistration(TypeParameter typeParameter) {
		switch typeParameter {
			GenericType: typeParameter.synthesizeRegistration
			Type: typeParameter.reference
			default:
				"[unknown type parameter]"
		}		
	}
	
	

}
