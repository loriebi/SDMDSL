/*
 * generated by Xtext 2.9.0
 */
package org.xtext.alma.container


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class ContainerStandaloneSetup extends ContainerStandaloneSetupGenerated {

	def static void doSetup() {
		new ContainerStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
