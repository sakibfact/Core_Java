package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailFastAndFailSafe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> l = new ArrayList<>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(6);
		l.add(5);

		l.remove(4);
		Iterator<Integer> itr = l.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}
}
