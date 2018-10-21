package com.ruwan.test.practice.labda;

public class ThreadExamle {

	public static void main(String[] args) {

		//Runnable lambda = ()-> System.out.println("new Thread");
		Thread t = new Thread(()-> System.out.println("new Thread"));

		t.run();
	}

}
