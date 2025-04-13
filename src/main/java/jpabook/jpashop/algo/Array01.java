package jpabook.jpashop.algo;

import java.util.Arrays;
import java.util.Collections;

public class Array01 {
    public static void main(String[] args) {

    }

    public static int[] solution(int[] arr) {

        Integer[] boxArr = Arrays.stream(arr).boxed().distinct().toArray(Integer[]::new);

        Arrays.sort(boxArr,Collections.reverseOrder());

        return Arrays.stream(boxArr).mapToInt(Integer::intValue).toArray();
    }
}
