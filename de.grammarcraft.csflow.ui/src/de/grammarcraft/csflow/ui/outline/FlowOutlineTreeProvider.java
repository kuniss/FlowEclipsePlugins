/*
* generated by Xtext
*/
package de.grammarcraft.csflow.ui.outline;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ui.editor.outline.IOutlineNode;
import org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider;

import de.grammarcraft.csflow.flow.CSTypeParameter;
import de.grammarcraft.csflow.flow.Flow;
import de.grammarcraft.csflow.flow.GenericType;
import de.grammarcraft.csflow.flow.GlobalInputPort;
import de.grammarcraft.csflow.flow.GlobalOutputPort;
import de.grammarcraft.csflow.flow.LeftPort;
import de.grammarcraft.csflow.flow.NativeClass;
import de.grammarcraft.csflow.flow.NativeMethod;
import de.grammarcraft.csflow.flow.OperationTypeParameters;
import de.grammarcraft.csflow.flow.Port;
import de.grammarcraft.csflow.flow.RightPort;
import de.grammarcraft.csflow.flow.Stream;
import de.grammarcraft.csflow.flow.UnnamedSubFlowPort;

/**
 * customization of the default outline structure
 * 
 */
public class FlowOutlineTreeProvider extends DefaultOutlineTreeProvider {

	protected Object _text(Stream stream) {
		return "stream on " + stream.getMessage();
	}


	protected void _createChildren(IOutlineNode parentNode, Stream stream) {
		LeftPort leftPort = stream.getLeftPort();
		boolean leftPortIsLeaf = leftPort instanceof GlobalInputPort
				|| leftPort instanceof UnnamedSubFlowPort;
		createEObjectNode(parentNode, leftPort, imageDispatcher.invoke(leftPort), 
				"left port " + getPortName(leftPort), leftPortIsLeaf);
		RightPort rightPort = stream.getRightPort();
		boolean rightPortIsLeaf = rightPort instanceof GlobalOutputPort 
				|| rightPort  instanceof UnnamedSubFlowPort;
		createEObjectNode(parentNode, rightPort , imageDispatcher.invoke(rightPort), 
				"right port " + getPortName(rightPort ), rightPortIsLeaf);
	}

	private String getPortName(LeftPort leftPort) {
		if (leftPort instanceof Port) 
			return ((Port)leftPort).getFunctionUnit().getName();
		else if (leftPort instanceof UnnamedSubFlowPort) 
			return determineContainingFlow(leftPort).getName() + ".in";
		else // if (leftPort instanceof GlobalInputPort) 
			return ".in";
	}

	private String getPortName(RightPort rightPort) {
		if (rightPort instanceof Port) 
			return ((Port)rightPort).getFunctionUnit().getName();
		else if (rightPort instanceof UnnamedSubFlowPort) 
			return determineContainingFlow(rightPort).getName() + ".out";
		else // if (leftPort instanceof GlobalOutputPort) 
			return ".out";
	}

	private Flow determineContainingFlow(EObject leftOrRightPort) {
		if (!(leftOrRightPort instanceof LeftPort || leftOrRightPort instanceof RightPort))
				throw new RuntimeException("determineContainigFlow(): LeftPort or RightPort object required");
		EObject parent = leftOrRightPort.eContainer();
		while (!(parent instanceof Flow))
		{
			parent = parent.eContainer();
		}
		return (Flow)parent;
	}
	
	protected Object _text(NativeClass nativeClass) {
		return "class " + nativeClass.getReference();
	}
	
	protected boolean _isLeaf(NativeClass nativeClass) {
		return true;
	}

	protected Object _text(NativeMethod method) {
		return "method " + method.getName();
	}

	protected Object _text(GenericType genericType) {
		return "generic type " + genericType.getOperationType().getName();
	}

	protected void _createChildren(IOutlineNode parent, GenericType genericType) {
		createNode(parent, genericType.getOperationTypeParameters());
	}

	protected void _createChildren(IOutlineNode parent, OperationTypeParameters operationTypeParameters) {
		createNode(parent, operationTypeParameters.getTypeParameter());
		for (CSTypeParameter operationTypeParameter : operationTypeParameters.getTypeParameters()) {
			createNode(parent, operationTypeParameter.getTypeParameter());
		}
	}
}
