package com.collection;

import java.util.ArrayList;
import java.util.List;

class Employee {
	
	private int id;
	private String name;
	private int age;
	
	public Employee(int id,String name,int age) {
		this.id=id;
		this.name=name;
		this.age=age;
		
	}
	
	public int getId() {
		return id;
		
	}
	public void setId(int id) {
		this.id=id;
	}
	public String getName() {
		return name;
		
	}
	public void setName(String name) {
		this.name=name;
		
	}
	
	public int getAge() {
		return age;
		
	}
	public void setAge(int age) {
		this.age=age;
	}
}
	
 public class Main{
		
		public static void main(String[] args) {
			
			List<Employee> employeeList =new ArrayList<>();
			
			for(int i=1;i<=10;i++) {
				Employee employee =new Employee(i,"Employee"+i,0);
				employeeList.add(employee);
			}
			
			List<Employee> updatedEmployeeList=new ArrayList<>();
			
			for(Employee employee : employeeList) {
				employee.setAge(18);
				updatedEmployeeList.add(new Employee(employee.getId(),employee.getName(),employee.getAge()));
			}
			System.out.println();
			
			for(Employee employee : updatedEmployeeList) {
				
				System.out.println("ID :" +employee.getId() + "Name :"+employee.getName()+" Age :"+employee.getAge());
			}
	}
}
