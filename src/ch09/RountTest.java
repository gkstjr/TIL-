package ch09;

import java.util.ArrayList;

public class RountTest {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(new Integer(100));
		list.add(100);
		
		System.out.println(list);
//		Integer i = list.get(0);
		int i = list.get(0);
	}
}
