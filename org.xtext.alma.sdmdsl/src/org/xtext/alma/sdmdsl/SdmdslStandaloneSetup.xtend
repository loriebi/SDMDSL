/*
 * generated by Xtext 2.9.0
 */
package org.xtext.alma.sdmdsl


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class SdmdslStandaloneSetup extends SdmdslStandaloneSetupGenerated {

	def static void doSetup() {
		new SdmdslStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
