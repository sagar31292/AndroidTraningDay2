package com.ncr.day2.data_binding_example;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.ncr.day2.R;
import com.ncr.day2.data_binding_example.Person;
import com.ncr.day2.databinding.ActivityMainBinding;

public class DataBindingActivity extends AppCompatActivity {

	ActivityMainBinding binding;
	Person person;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
		person = new Person("First Name", "Last Name");
		binding.setPerson(person);
	}
}
