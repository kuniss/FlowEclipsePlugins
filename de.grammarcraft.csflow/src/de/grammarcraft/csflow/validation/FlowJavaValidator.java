package de.grammarcraft.csflow.validation;

import org.eclipse.xtext.validation.Check;

import de.grammarcraft.csflow.flow.EbcOperation;
import de.grammarcraft.csflow.flow.Flow;
import de.grammarcraft.csflow.flow.FlowPackage;
import de.grammarcraft.csflow.flow.FunctionUnit;
import de.grammarcraft.csflow.flow.MethodOperation;
import de.grammarcraft.csflow.flow.Model;
 

public class FlowJavaValidator extends AbstractFlowJavaValidator {

	public static final String NAME_MUST_BE_UNIQUE = "name must be unique";
	
	@Check
	public void checkNameIsUnique(Flow f) {
	    Model model = (Model) f.eContainer();
	    if(model != null) {
	        for(FunctionUnit fu: model.getFunctionUnits()) {
	            if (f.getName().equals(fu.getName()) && f != fu) {
	                error("flow names have to be unique",
	                        FlowPackage.Literals.FUNCTION_UNIT__NAME);
	                return;
	            }
	        }
	    }
	}

	@Check
	public void checkNameIsUnique(EbcOperation op) {
	    Model model = (Model) op.eContainer();
	    if(model != null) {
	        for(FunctionUnit fu: model.getFunctionUnits()) {
	            if (op.getName().equals(fu.getName()) && op != fu) {
	                error("EBC  operation names have to be unique",
	                        FlowPackage.Literals.FUNCTION_UNIT__NAME, NAME_MUST_BE_UNIQUE, op.getName());
	                return;
	            }
	        }
	    }
	}

	@Check
	public void checkNameIsUnique(MethodOperation op) {
	    Model model = (Model) op.eContainer();
	    if(model != null) {
	        for(FunctionUnit fu: model.getFunctionUnits()) {
	            if (op.getName().equals(fu.getName()) && op != fu) {
	                error("EBC  operation names have to be unique",
	                        FlowPackage.Literals.FUNCTION_UNIT__NAME, NAME_MUST_BE_UNIQUE, op.getName());
	                return;
	            }
	        }
	    }
	}

//	@Check
//	public void checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character.isUpperCase(greeting.getName().charAt(0))) {
//			warning("Name should start with a capital", MyDslPackage.Literals.GREETING__NAME);
//		}
//	}

}
