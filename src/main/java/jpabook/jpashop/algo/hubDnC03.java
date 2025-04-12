package jpabook.jpashop.algo;

import java.util.*;
import java.util.stream.*;

public class hubDnC03 {
    public static void main(String[] args) {
        System.out.println(solution(30));
    }

    public static int solution(int n) {
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime,true);
        isPrime[0] = false; isPrime[1] = false;

        int sum = 0;

        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(isPrime[i]) {
                for(int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        return IntStream.rangeClosed(2,n)
                .filter(i -> isPrime[i])
                .sum();
    }
}
