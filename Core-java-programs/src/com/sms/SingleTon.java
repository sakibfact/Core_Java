package com.sms;

public class SingleTon {

	private static SingleTon singleTon;

	private SingleTon() {
		if (null != singleTon) {
			throw new IllegalArgumentException("Alreday object exist!!");
		}

	}

	public static SingleTon getInstance() {

		if (singleTon == null) {
			synchronized (SingleTon.class) {
				singleTon = new SingleTon();
			}
		}
		return singleTon;
	}
}
