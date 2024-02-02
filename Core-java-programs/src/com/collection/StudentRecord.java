package com.collection;

import java.util.ArrayList;
import java.util.List;

class Student {
	private int rollNo;
	private String name;
	private int age;
	private long fees;

	public Student(int rollNo, String name, int age, long fees) {
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
		this.fees = fees;

	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;

	}

	public int getAge() {
		return age;

	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getFees() {
		return fees;
	}

	public void setFees(long fees) {
		this.fees = fees;
	}
}

public class StudentRecord {

	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<>();

		for (int i = 1; i <= 10; i++) {

			Student student = new Student(i, "Student" + i, i, 0);
			studentList.add(student);

		}

		List<Student> updatedList = new ArrayList<>();
		for (Student st : studentList) {
			st.setAge(18);
			st.setFees(5000);

			updatedList.add(new Student(st.getRollNo(), st.getName(), st.getAge(), st.getFees()));


		}
		System.out.println();
		
		for (Student stu : updatedList) {
			System.out.println("Roll no : " + stu.getRollNo() + " Name : " + stu.getName() + " Age : " + stu.getAge()
					+ " Fees : " + stu.getFees());
		}

	}
}
