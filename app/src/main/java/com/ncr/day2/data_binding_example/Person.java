package com.ncr.day2.data_binding_example;

import android.content.Context;

import com.ncr.day2.R;

public class Person {
	public final String firstName;
	public final String lastName;

	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getPersonNameFromString(Context context) {
		return context.getString(R.string.app_name);
	}
}