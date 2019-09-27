package com.ncr.day2.lambda;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Lambda extends AppCompatActivity implements SingleMethodInterface{

	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		//Without Lambda
		StateOwner stateOwner = new StateOwner();
		stateOwner.addSingleMethodListener(this);

		//With Lambda
		stateOwner.addSingleMethodListener((oldState, newState) -> "State changed");

		//Without Lambda
		stateOwner.addMultipleMethodListener(new MultipleMethodInterface() {
			@Override
			public String firstMethod(String oldState, String newState) {

				return "Test String";
			}

			@Override
			public void secondMethod(String oldState) {

			}
		});

		//With Lambda
		stateOwner.addMultipleMethodListener((oldState, newState) -> {
			return "Test String";
		});


	}

	@Override
	public String firstMethod(String oldState, String newState) {
		return "dsd";
	}
}


