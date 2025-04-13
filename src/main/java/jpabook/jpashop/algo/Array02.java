package main.java.jpabook.jpashop.algo;
import java.util.*;
public class Array02 {
    public static void main(String[] args) {
    		
    }

    public int[] solution(int[] numbers) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        
        for(int i = 0; i < numbers.length; i++) {
            for(int j = i + 1 ; j < numbers.length; j++) {
                arr.add(numbers[i] + numbers[j]);
            }
        }
        
        return arr.stream().distinct().sorted().mapToInt(Integer::intValue).toArray();
    }
}
