import java.util.Scanner;

public class Solution5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        StringBuilder sb = new StringBuilder();

        char[] ch = str.toCharArray();
        for(int i = 0 ; i < str.length(); i++ ) {
        	Character temp = ch[i];
        	if(Character.isUpperCase(temp)) { // 대문자면
        		Character answer = Character.toLowerCase(temp);
        		sb.append(answer);
        	}else { // 소문자
        		Character answer = Character.toUpperCase(temp);
        		sb.append(answer);
        	}
        	
        }
        System.out.println(sb);
        
    }
}