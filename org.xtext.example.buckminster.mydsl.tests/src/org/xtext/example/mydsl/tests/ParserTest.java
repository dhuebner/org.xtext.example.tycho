package org.xtext.example.mydsl.tests;

import static junit.framework.Assert.*;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.xtext.example.mydsl.MyDslInjectorProvider;
import org.xtext.example.mydsl.MyDslUiInjectorProvider;
import org.xtext.example.mydsl.myDsl.Greeting;
import org.xtext.example.mydsl.myDsl.Model;

import com.google.inject.Inject;

/**
 * Simple Parser non UI Test.<br>
 * 
 * @see MyDslInjectorProvider
 * @see MyDslUiInjectorProvider
 * 
 */
@RunWith(XtextRunner.class)
@InjectWith(MyDslInjectorProvider.class)
public class ParserTest {

	@Inject
	private ParseHelper<EObject> parseHelper;

	@Test
	public void testParser() throws Exception {
		EObject model = parseHelper.parse("Hello world!");
		assertTrue(model instanceof Model);
		EList<Greeting> greetings = ((Model) model).getGreetings();
		assertEquals(1, greetings.size());
		assertEquals("world", greetings.get(0).getName());
	}
}