/*
 * generated by Xtext 2.9.1
 */
package org.xtext.alma.enumeration.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.xtext.alma.enumeration.ui.internal.EnumerationActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class EnumerationExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return EnumerationActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return EnumerationActivator.getInstance().getInjector(EnumerationActivator.ORG_XTEXT_ALMA_ENUMERATION_ENUMERATION);
	}
	
}
