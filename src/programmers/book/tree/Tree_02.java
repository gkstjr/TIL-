package programmers.book.tree;
import java.util.*;

public class Tree_02 {
	 static HashMap<String , String> referralMap = new HashMap<>();
    static HashMap<String , Integer> sellerAmount = new HashMap<String , Integer>();

	    public int[] solution(String[] enroll, String[] referral, String[] seller, int[] amount) {
	        int[] answer = new int[enroll.length];
	        
	        
	        for(int i = 0 ; i < referral.length; i++) {
	            String ref = referral[i];
	            if(ref.equals("-")) continue;
	            referralMap.put(enroll[i] , referral[i]);
	        }
	            
	        for(int i = 0 ; i < seller.length; i++) {
	            String sel = seller[i];
	            int selAmount = amount[i];
	            
	            recur(sel , selAmount);
	        }
	        return answer;
	    }
	    
	    private static void recur(String seller , int amount) {
	        if(!referralMap.containsKey(seller)) return;
	        
	        int totalMoney = amount * 100;
	        int refMoney = totalMoney / 10;
	        if(refMoney < 1) refMoney = 0;
	        int mine = totalMoney - refMoney;
	        
	        sellerAmount.put(seller , sellerAmount.getOrDefault(seller , 0) + mine);
	        recur(referralMap.get(seller) , refMoney);
	        
	    }
}
