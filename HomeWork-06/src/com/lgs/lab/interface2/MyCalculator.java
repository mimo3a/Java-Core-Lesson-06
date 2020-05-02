package com.lgs.lab.interface2;

public class MyCalculator implements com.lgs.lab.interface1.Numerable{

	@Override
	public void plus() {
		
		System.out.println("This is PLUS");
	}

	@Override
	public void minus() {
		
		System.out.println("This is MINUS");
	}

	@Override
	public void multiply() {
		System.out.println("This is MULTIPLY");
		
	}

	@Override
	public void devide() {
		System.out.println("This is DEVIDE");
		
	}
	

}
