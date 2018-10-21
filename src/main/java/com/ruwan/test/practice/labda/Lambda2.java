package com.ruwan.test.practice.labda;

public class Lambda2 {
	
	
	public void greet(Greeting greeting) {
		greeting.perform();
	}
	

	public static void main(String[] args) {
		
		Greeting lambdaExp = ()-> System.out.println("Hello 2nd Way");
		lambdaExp.perform();
		
		//Lambda2 l2 =  new Lambda2();
		//l2.greet(lambdaExp);
		
		
	}
	

}
