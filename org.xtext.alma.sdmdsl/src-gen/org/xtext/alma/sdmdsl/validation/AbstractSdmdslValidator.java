/*
 * generated by Xtext 2.9.1
 */
package org.xtext.alma.sdmdsl.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractSdmdslValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(org.xtext.alma.sdmdsl.sdmdsl.SdmdslPackage.eINSTANCE);
		return result;
	}
	
}
