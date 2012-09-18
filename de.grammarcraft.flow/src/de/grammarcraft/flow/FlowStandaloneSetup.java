
package de.grammarcraft.flow;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class FlowStandaloneSetup extends FlowStandaloneSetupGenerated{

	public static void doSetup() {
		new FlowStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

