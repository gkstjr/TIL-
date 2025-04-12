package jpabook.jpashop.algo;
public class hubDnC01 {
    public static void main(String[] args) {
        String[] arr = {"answer : 1, score : 5",
                "answer : 3, score : 10",
                "answer : 1, score : 3"
        };
        System.out.println(solution(arr));
    }

    public static String solution(String[] arr) {

        int[] result = new int[6];

        for(String str : arr) {
            String[] part = str.split(",");
            int answer = Integer.parseInt(part[0].split(":")[1].trim());
            int score = Integer.parseInt(part[1].split(":")[1].trim());

            result[answer] += score;
        }
        //반환 문자열 셋팅
        StringBuilder sb = new StringBuilder();
        int aScore = result[1];
        int bScore = result[3];
        int cScore = result[5];

        int max = Math.max(Math.max(aScore , bScore),cScore);


        if(max == aScore) sb.append("a : ").append(aScore);
        if(max == bScore) {
            if(sb.length() > 0) sb.append(", ");
            sb.append("b : ").append(bScore);
        }
        if(max == cScore) {
            if(sb.length() > 0) sb.append(", ");
            sb.append("c : ").append(cScore);
        }

        return sb.toString();
    }
}
