package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListTraversMultipleWays {

	public static void main(String[] args) {
		
		List<String> list=new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		list.add("F");
		list.add("G");

		System.out.println("Traversing list through List Iterator:");  
		ListIterator<String> newList=list.listIterator(list.size());
		while(newList.hasPrevious()) {
			String str=newList.previous();         
			System.out.println(str);
		}
		
		System.out.println("Traversing list through for loop:");  
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("Travers list by foreach");
		for(String str1:list) {
			System.out.println(str1);
		}
		
		System.out.println("traverse list by Iterator Interface");
		Iterator<String> itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		 System.out.println("Traversing list through forEach() method:");  
		list.forEach(a->{
			System.out.println(a);
		});
		
		 System.out.println("Traversing list through forEachRemaining() method:");  
		 Iterator<String> itr1=list.iterator();
		 itr1.forEachRemaining(a1->{
			 System.out.println(a1);
		 });
	
		 System.out.println("Traversing forwerd direction by List Iterator");
		 ListIterator<String> l=list.listIterator();
		 while(l.hasNext()) {
			 String s=l.next();
			 System.out.println(s);
			 
			 
		 }
		 System.out.println("+++++++++++++++++++++++");
		 String str="java";
		 int codePointCount = str.codePointCount(1, 3);
		 System.out.println(codePointCount);
	}

}
