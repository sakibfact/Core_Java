package com.basic;

public class MultipleMainMethod {

	public static void main(String[] args) {

		System.out.println(" MultipleMainMethod");
	}

	class A {
		public static void main(String[] args) {
			System.out.println("A main method");
		}
	}

	class B {
		public static void main(String[] args) {
			System.out.println("B main method");
		}
	}

	class C {
		public static void main(String[] args) {
			System.out.println("C main method");
		}
	}

	class D {
		public static void main(String[] args) {
			System.out.println("D main method");
		}
	}
}
