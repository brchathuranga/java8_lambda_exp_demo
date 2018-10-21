package com.ruwan.test.practice;

import com.ruwan.test.practice.labda.Greeting;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		Greeting lambdaGreet = () -> {
			System.out.print("Hello Lambda");
		};

		lambdaGreet.perform();

	}
}
