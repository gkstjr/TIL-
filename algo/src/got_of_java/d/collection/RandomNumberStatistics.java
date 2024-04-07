package got_of_java.d.collection;

import java.util.Set;
import java.util.Random;
import java.util.Hashtable;

public class RandomNumberStatistics {
	private final int DATA_BOUNDARY = 50;
	public Hashtable<Integer, Integer> hashTable = new Hashtable<Integer,Integer>();
	
	public static void main(String[] args) {
		RandomNumberStatistics ran = new RandomNumberStatistics();
		ran.getRandomNumberStatistics();
	}
	
	public void getRandomNumberStatistics() {
		Random rm = new Random();
		
		
		for(int i = 0 ; i < 5000; i++) {
			int tempNumber = rm.nextInt(50) + 1;
			putCurrentNumber(tempNumber);
		}
		
		printStatistics();
	}
	
	public void putCurrentNumber(int tempNumber) {
		if(hashTable.containsKey(tempNumber)) {
			hashTable.put(tempNumber,hashTable.get(tempNumber) + 1);
		}else {
			hashTable.put(tempNumber, 1);
		}
	}
	
	public void printStatistics() {
		Set<Integer> set = hashTable.keySet();
		
		for(Integer n : set) {
			int temp = hashTable.get(n);
			
			if(n%10 - 1 == 0) {
				System.out.println();
			}
			System.out.print(n + "=" + temp + "\t");				
		}
	}
}
