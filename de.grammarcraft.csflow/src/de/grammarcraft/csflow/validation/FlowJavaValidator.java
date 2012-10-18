package de.grammarcraft.csflow.validation;

import org.eclipse.xtext.validation.Check;
import de.grammarcraft.csflow.flow.ClassOperation;
import de.grammarcraft.csflow.flow.EbcOperation;
import de.grammarcraft.csflow.flow.Flow;
import de.grammarcraft.csflow.flow.FlowPackage;
import de.grammarcraft.csflow.flow.FunctionUnit;
import de.grammarcraft.csflow.flow.MethodOperation;
import de.grammarcraft.csflow.flow.Model;
import de.grammarcraft.csflow.flow.Port;
import de.grammarcraft.csflow.flow.Stream;
 

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
	                error("operation names have to be unique",
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
	                error("operation names have to be unique",
	                        FlowPackage.Literals.FUNCTION_UNIT__NAME, NAME_MUST_BE_UNIQUE, op.getName());
	                return;
	            }
	        }
	    }
	}

	@Check
	public void checkNameIsUnique(ClassOperation op) {
	    Model model = (Model) op.eContainer();
	    if(model != null) {
	        for(FunctionUnit fu: model.getFunctionUnits()) {
	            if (op.getName().equals(fu.getName()) && op != fu) {
	                error("operation names have to be unique",
	                        FlowPackage.Literals.FUNCTION_UNIT__NAME, NAME_MUST_BE_UNIQUE, op.getName());
	                return;
	            }
	        }
	    }
	}
	

	public static final String NAME_IS_UNUSED = "name is unused";

	@Check
	public void checkUnusedOperations(EbcOperation op) {
	    Model model = (Model) op.eContainer();
	    String opName = op.getName();
	    warningForUnusedOperation(model, opName);		
	}

	@Check
	public void checkUnusedOperations(MethodOperation op) {
	    Model model = (Model) op.eContainer();
	    String opName = op.getName();
	    warningForUnusedOperation(model, opName);		
	}

	@Check
	public void checkUnusedOperations(ClassOperation op) {
	    Model model = (Model) op.eContainer();
	    String opName = op.getName();
	    warningForUnusedOperation(model, opName);		
	}

	private void warningForUnusedOperation(Model model, String opName) {
		if(model != null) {
	        for(FunctionUnit fu: model.getFunctionUnits()) {
	        	if (fu instanceof Flow) {
	        		Flow flow = (Flow)fu;
	        		for (Stream stream : flow.getStreams()) {
						if (stream.getLeftPort() instanceof Port) {
							Port port = (Port)stream.getLeftPort();
							if (port.getFunctionUnit().getName().equals(opName)) return;
						}
						if (stream.getRightPort() instanceof Port) {
							Port port = (Port)stream.getRightPort();
							if (port.getFunctionUnit().getName().equals(opName)) return;
						}
					}
	        	}
	        }
	        warning("operation is defined but not used",
	        		FlowPackage.Literals.FUNCTION_UNIT__NAME, NAME_IS_UNUSED, opName);
	        return;
	    }
	}

}
