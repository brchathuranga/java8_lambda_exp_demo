package com.ruwan.test.practice.labda;

public class Lambda3 {

	public static void main(String[] args) {

		//StringLengthLambda lmbdaExp = (String s) -> s.length();  1
		//StringLengthLambda lmbdaExp = (s) -> s.length();  2
		StringLengthLambda lmbdaExp = s -> s.length(); // if one arg can avoid parenthesis
		lmbdaExp.getLength("My Name is Ruwan");
		System.out.println("Length : " + lmbdaExp.getLength("My Name is Ruwan"));

	}

	interface StringLengthLambda {
		int getLength(String s);
	}
}
