/**
 * generated by Xtext 2.9.0
 */
package org.xtext.alma.sdmdsl;

import org.xtext.alma.sdmdsl.SdmdslStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class SdmdslStandaloneSetup extends SdmdslStandaloneSetupGenerated {
  public static void doSetup() {
    SdmdslStandaloneSetup _sdmdslStandaloneSetup = new SdmdslStandaloneSetup();
    _sdmdslStandaloneSetup.createInjectorAndDoEMFRegistration();
  }
}
