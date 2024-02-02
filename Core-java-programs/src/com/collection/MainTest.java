package com.collection;

import java.util.ArrayList;
import java.util.List;

public class MainTest {
public static void main(String[] args) {
	 List<EmployeeDetails> list = new ArrayList<>();
	 List<EmployeeDetails> list1 = new ArrayList<>();
	 list.add(new EmployeeDetails("101", "asad", "mumbai","India","898989"));
	 list.add(new EmployeeDetails("102", "sakib", "delhi","Japan","787878787" ));
	 list.add(new EmployeeDetails("103", "sa", "kanpur","Nepal","788888889"));
	 list.add(new EmployeeDetails("104", "deepak", "lucknow","India","767676767"));
	 list.add(new EmployeeDetails("105", "ajmal", "banaras","America","9090909090"));
	 
	 //System.out.println(list);
	 for (EmployeeDetails object1 : list) {
		 if (object1.getUsername().startsWith("s")&& object1.getUsername().length()>=3) {
			list1.add(object1);
			
		}
	}
	 System.out.println(list1);
}
}
