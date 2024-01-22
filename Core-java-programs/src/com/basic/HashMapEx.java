package com.basic;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {

	public static void main(String[] args) {

		Map<Integer, String> map=new HashMap<>();
		
		map.put(1, "India");
		map.put(2, "USA");
		map.put(3, null);
		map.put(null, null);
		
		for(Map.Entry m: map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
			
		}
		
	}					

}
