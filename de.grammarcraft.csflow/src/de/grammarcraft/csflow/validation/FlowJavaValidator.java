package de.grammarcraft.csflow.validation;

import org.eclipse.xtext.validation.Check;

import de.grammarcraft.csflow.flow.CSTypeParameter;
import de.grammarcraft.csflow.flow.ClassOperation;
import de.grammarcraft.csflow.flow.EbcOperation;
import de.grammarcraft.csflow.flow.Flow;
import de.grammarcraft.csflow.flow.FlowPackage;
import de.grammarcraft.csflow.flow.FunctionUnit;
import de.grammarcraft.csflow.flow.GenericType;
import de.grammarcraft.csflow.flow.MethodOperation;
import de.grammarcraft.csflow.flow.Model;
import de.grammarcraft.csflow.flow.Port;
import de.grammarcraft.csflow.flow.Signature;
import de.grammarcraft.csflow.flow.Stream;
import de.grammarcraft.csflow.flow.Type;
import de.grammarcraft.csflow.flow.TypeParameter;
 

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
	
	public static final String NOT_ALLOWED_PARAMETER_TYPE = "not allowed parameter type at this position";
	/**
	 * Checks for allowed signatures.
	 * Allowed are:<br>
	 * Action<br>
	 * Func&lt;T0&gt;<br>
	 * Action&lt;Action&lt;T0&gt;&gt;<br>
	 * Action&lt;Action&lt;T0&gt;, Action&lt;T1&gt;&gt;<br>
	 * Action&lt;T0&gt;<br>
 	 * Func&lt;T0, T1&gt;<br>
	 * Action&lt;T0, Action&lt;T1&gt;&gt;<br>
	 * Action&lt;T0, Action&lt;T1&gt;, Action&lt;T2&gt;&gt;<br>
	 * @param signature signature node object
	 */
	@Check
	public void checkMethodSignature(Signature signature)  {
		GenericType type = signature.getType();
		if (type.getOperationType().getName().equals("Action")) {
			if (type.getOperationTypeParameters() == null) return; // allowed
			else {
				if (type.getOperationTypeParameters() != null) {
					if (!isAllowedActionOrOrdinaryType(type.getOperationTypeParameters().getTypeParameter()))
		                error(NOT_ALLOWED_PARAMETER_TYPE,
		                        FlowPackage.Literals.SIGNATURE__TYPE, NOT_ALLOWED_PARAMETER_TYPE);
					for (CSTypeParameter csTypeParameter : type.getOperationTypeParameters().getTypeParameters()) {
						if (!isAllowedActionOrOrdinaryType(csTypeParameter.getTypeParameter()))
			                error(NOT_ALLOWED_PARAMETER_TYPE,
			                        FlowPackage.Literals.SIGNATURE__TYPE, NOT_ALLOWED_PARAMETER_TYPE);
					}
				}
			}
		} 
		else if (type.getOperationType().getName().equals("Func")) {
			if (type.getOperationTypeParameters() == null)
                error("Func operation type requires at least one paramter type be specified",
                        FlowPackage.Literals.SIGNATURE__TYPE, NOT_ALLOWED_PARAMETER_TYPE);
			else {
				if (type.getOperationTypeParameters().getTypeParameters().size() > 1)
	                error("Func has more than 2 parameter types; one or two are allowed",
	                        FlowPackage.Literals.SIGNATURE__TYPE, NOT_ALLOWED_PARAMETER_TYPE);
				if (type.getOperationTypeParameters().getTypeParameter() instanceof GenericType)
		                error("Func has to be ordinary types not generic ones",
		                        FlowPackage.Literals.SIGNATURE__TYPE, NOT_ALLOWED_PARAMETER_TYPE);
				if (type.getOperationTypeParameters().getTypeParameters() != null) {
					for (CSTypeParameter cstypeParameter : type.getOperationTypeParameters().getTypeParameters()) {
						if (cstypeParameter.getTypeParameter() instanceof GenericType)
			                error("Func has to be ordinary types not generic ones",
			                        FlowPackage.Literals.SIGNATURE__TYPE, NOT_ALLOWED_PARAMETER_TYPE);							
					}
				}
			}
		}
	}

	/**
	 * Checks if the given TypeParameter is an allowed Action or an ordinary type.
	 * An allowed action is Action&lt;T0&gt; as parameter type.
	 * @param typeParameter
	 * @return 
	 */
	private boolean isAllowedActionOrOrdinaryType(TypeParameter typeParameter) {
		if (typeParameter instanceof GenericType)  {
			GenericType genericType = (GenericType) typeParameter;
			if (genericType.getOperationType().getName().equals("Action")
					&& genericType.getOperationTypeParameters() != null
					&& genericType.getOperationTypeParameters().getTypeParameter() instanceof Type 
					&& genericType.getOperationTypeParameters().getTypeParameters() == null) 
				return true;
			else
				return false;
		}	
		return true; // ordinary types
	}

}
