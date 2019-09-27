package com.ncr.day2.view_model_example;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;

import com.ncr.day2.R;

import java.util.List;

public class ViewModelActivity extends AppCompatActivity {

	UsersViewModel usersViewModel;

	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_view_model);

		 usersViewModel = ViewModelProviders.of(this).get(UsersViewModel.class);

	}

	public void addUsers(View view) {
		usersViewModel.addUser(new User("user1", "password1"));
		usersViewModel.addUser(new User("user2", "password2"));
		usersViewModel.addUser(new User("user3", "password3"));

	}

	public void showUsers(View view) {

		List<User> users = usersViewModel.getUserList();
		Log.d("Users",users.toString());

	}
}
