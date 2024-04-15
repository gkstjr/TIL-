package got_of_java.d.collection;

import java.util.*;

public class ManageHeight {
	public ArrayList<ArrayList<Integer>> gradeHeights;
	public double avg;
	public static void main(String[] args) {
		ManageHeight method = new ManageHeight();
		method.setData();
//		method.printHeight(0);
//		method.printHeight(1);
//		method.printHeight(2);
//		method.printHeight(3);
//		method.printHeight(4);
		method.printAverage(0);
		method.printAverage(1);
		method.printAverage(2);
		method.printAverage(3);
		method.printAverage(4);

	}
	
	public void printAverage(int classNo) {
		avg = 0;
		System.out.println("Class No. : " + (classNo + 1));

		ArrayList<Integer> list = gradeHeights.get(classNo); 
		for(int n : list) {
			avg += n;
		}
		
		avg /= list.size(); 
		
		System.out.println("Height average: " + avg);
				
	}
	
	public void printHeight(int classNo) {
		System.out.println("Class No. : " + (classNo + 1));
		ArrayList<Integer> list = gradeHeights.get(classNo); 
		for(int i = 0 ; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
	public void setData() {
		gradeHeights = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(170);
		list.add(180);
		list.add(173);
		list.add(175);
		list.add(177);
		
		gradeHeights.add(list);
		list = new ArrayList<Integer>();
		
		list.add(160);
		list.add(165);
		list.add(167);
		list.add(186);

		gradeHeights.add(list);
		list = new ArrayList<Integer>();
		
		list.add(158);
		list.add(177);
		list.add(187);
		list.add(176);
		
		gradeHeights.add(list);
		list = new ArrayList<Integer>();
	
		list.add(173);
		list.add(182);
		list.add(181);
		
		gradeHeights.add(list);
		list = new ArrayList<Integer>();

		list.add(170);
		list.add(180);
		list.add(165);
		list.add(177);
		list.add(172);
		
		gradeHeights.add(list);
		list = new ArrayList<Integer>();
		
		
	}
}
