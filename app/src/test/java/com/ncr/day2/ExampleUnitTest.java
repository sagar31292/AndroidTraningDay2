package com.ncr.day2;

import android.content.Context;

import com.ncr.day2.data_binding_example.Person;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

	Context context;
	Person person;

	@Before
	public void setup() {
		context = mock(Context.class);
		when(context.getString(R.string.app_name)).thenReturn("App Name");

		person = mock(Person.class);
		when(person.getPersonNameFromString(context)).thenReturn("Sagar Modi");
	}

	@Test
	public void testMockObject() {
		assertEquals("App Name", context.getString(R.string.app_name));
	}

	@Test
	public void testPersonObject() {
		assertEquals("Sagar Modi", person.getPersonNameFromString(context));

	}
}