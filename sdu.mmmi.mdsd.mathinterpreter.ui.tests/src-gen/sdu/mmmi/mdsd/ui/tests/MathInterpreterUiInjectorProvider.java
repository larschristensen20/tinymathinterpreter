/*
 * generated by Xtext 2.16.0
 */
package sdu.mmmi.mdsd.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import sdu.mmmi.mdsd.mathinterpreter.ui.internal.MathinterpreterActivator;

public class MathInterpreterUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return MathinterpreterActivator.getInstance().getInjector("sdu.mmmi.mdsd.MathInterpreter");
	}

}
