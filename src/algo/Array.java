package algo;

public class Array {

	public static void main(String[] args) {
		//ë°°ì—´?? ?™?¼?•œ ?°?´?„°?˜ ëª¨ìŒ?´?‹¤
		//ë°°ì—´?? ê°™ì? ?˜•?ƒœ?´ê¸°ë§Œ ?•˜ë©? ?ƒ?„±?´ ê°??Š¥?•˜?‹¤
		//ex) ë°°ì—´?? ?°?´?„° ê°œìˆ˜ë¥? ì¶”ë¦¬?•´?„œ ë¨¼ì? ?ƒ?„±?•´?•¼ ?•œ?‹¤.
			////= 3ëª…ì˜ ?•™?ƒ?´ ?ˆ?–´?•¼ ?•˜ë¯?ë¡? 3ì¹¸ì˜ ë°°ì—´?„ ?ƒ?„±?•œ?‹¤.
			////student -------> [?][?][?]
			int[] student = new int[3];
			  
			student[0] = 60; ///student?˜ +0ì§?? ?— 60?„ ???¥?•˜?¼!
			///student -------->[60][][0]
			student[1] = 75; ///student?˜ +1ì§?? ?— 75?„ ???¥?•˜?¼!
			///student -------->[60][75][0]
			student[2] = 88; ///student?˜ +2ì§?? ?— 88?„ ???¥?•˜?¼!
			///student -------->[60][75][88]
			
			System.out.println(student[0]);
			System.out.println(student[1]);
			System.out.println(student[2]);
			
			int total = student[0] + student[1] + student[2];
			System.out.println(total); 
			float average = (float)total / student.length;///student?˜ ê¸¸ì´ = 3
			System.out.println(average);
	
	}

}
