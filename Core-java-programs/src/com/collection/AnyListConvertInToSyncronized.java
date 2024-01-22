package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class AnyListConvertInToSyncronized {

	public static void main(String[] args) {

		List<String> l = new ArrayList<>();
		l.add("A");
		l.add("B");
		l.add("C");

		List<String> l1 = Collections.synchronizedList(l);

		System.out.println(l1);
		Iterator<String> itr = l1.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
