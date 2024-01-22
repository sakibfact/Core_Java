package com.sms;

public class SingletonMain {

	public static void main(String[] args) {
		SingleTon instance1 = SingleTon.getInstance();
		SingleTon instance2 = SingleTon.getInstance();
		System.out.println(instance1.hashCode());
		System.out.println(instance2.hashCode());
		
	}
}
