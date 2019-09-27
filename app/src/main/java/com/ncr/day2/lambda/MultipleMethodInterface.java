package com.ncr.day2.lambda;

public interface MultipleMethodInterface {
	String firstMethod(String oldState, String newState);

	default void secondMethod(String oldState) {

	}
	static void printItToSystemOut(String text){
		System.out.println(text);
	}
}
