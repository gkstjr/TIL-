package got_of_java.d.collection;

import java.util.HashSet;
import java.util.Random;

public class RandomNumberMaker {
	public static void main(String[] args) {
		RandomNumberMaker method = new RandomNumberMaker();
		for(int i  = 0 ; i < 10; i++) {
			System.out.println(method.getSixNumber());
		}
	}
	
	public HashSet<Integer> getSixNumber() {
		
		Random random = new Random();
		HashSet<Integer> set = new HashSet<Integer>();
		
		while(set.size() < 6) {
			int tempNumber = random.nextInt(45);			
			set.add(tempNumber);
		}
		
		return set;
	}
}
