package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListSortingElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> student=new ArrayList<>();
		student.add("Sakib");
		student.add("Mohammad");
		student.add("Khan");
		student.add("Arshad");
		student.add("Zaqi");
		student.add("waseem");
		
		Collections.sort(student);
		
		Iterator<String> itr=student.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
			System.out.println("Sorting Numbers++++++++");
			
			List<Integer> num1=new ArrayList<>();
			num1.add(9);
			num1.add(7);
			num1.add(8);
			num1.add(5);
			num1.add(3);
			num1.add(1);
			num1.add(2);
			num1.add(4);
			num1.add(6);
			num1.add(10);
			
			Collections.sort(num1);
			for(Integer s:num1) {
				System.out.println(s);
			}
			
		

	}

}
