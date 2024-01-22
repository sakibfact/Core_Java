package com.basic;

 class TestExample {

	public static void m1(Object ob) {
		
		System.out.println("Object version");
	}
	
	public class Test extends TestExample{
	public static void m1(String s) {
		System.out.println("String version");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		TestExample te=new TestExample();
		te.m1(te);
	}

}
}