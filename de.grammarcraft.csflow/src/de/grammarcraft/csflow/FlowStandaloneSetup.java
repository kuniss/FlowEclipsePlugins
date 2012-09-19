
package de.grammarcraft.csflow;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class FlowStandaloneSetup extends FlowStandaloneSetupGenerated{

	public static void doSetup() {
		new FlowStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

