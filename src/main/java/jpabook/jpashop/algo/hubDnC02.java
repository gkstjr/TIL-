package jpabook.jpashop.algo;
public class hubDnC02 {
    public static void main(String[] args) {
        long[] arr = {1,2,3};
        long answer = solution(arr);
        System.out.println(answer);
    }

    public static long solution(long[] arr) {
        long sum = 0;

        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                long a = arr[i];
                long b = arr[j];

                sum += (a * b) / gcd(a , b);
            }
        }
        return sum;
    }

    //최대공약수 반환
    private static long gcd(long a , long b) {
        while(b > 0) {
            long remain = a % b;
            a = b;
            b = remain;
        }
        return a;
    }
}
