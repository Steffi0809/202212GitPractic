package com.practic.git;

public class HelloWorld {
	public static void main(String[] args) {
		
		System.out.println("hello word");
		HelloWorld obj = new HelloWorld();
		obj.addition(3, 4);
	}
	public void addition(int x, int y) {
		int result = x+y;
		System.out.println("num1= "+x +"num2="+y);
		System.out.println("x+y="+result);
		
	}

}
