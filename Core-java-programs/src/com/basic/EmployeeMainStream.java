package com.basic;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class EmployeeMainStream {

	public static void main(String[] args) {

		List<Employee> employees = EmployeeMainStream.findByAllEmployees();
		System.out.println(employees);
		System.out.println("_________below employee in Descending order________");
		employees.stream().sorted(Comparator.comparing(Employee::getId).reversed()).toList()
				.forEach(System.out::println);
		System.out.println("_________below employee in ascending order_________");
		employees.stream().sorted(Comparator.comparing(Employee::getId)).toList()
				.forEach(System.out::println);

		
	}

	public static List<Employee> findByAllEmployees() {

		return Arrays.asList(
				new Employee(1, "Sakib", 24, 20000.00d), 
				new Employee(5, "Aamir", 23, 21000.00d),
				new Employee(3, "Arshad", 26, 22000.00d), 
				new Employee(4, "Asadullah", 22, 26000.00d),
				new Employee(2, "Xyz", 27, 2400.00d));

	}
}
