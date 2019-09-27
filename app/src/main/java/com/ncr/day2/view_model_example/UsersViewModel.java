package com.ncr.day2.view_model_example;

import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

public class UsersViewModel extends ViewModel {

	private List<User> userList = new ArrayList<>();

	List<User> getUserList() {
		return userList;
	}

	void addUser(User user) {

		userList.add(user);

	}

	public UsersViewModel(){}
}
