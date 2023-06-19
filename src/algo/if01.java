package algo;
import java.lang.*;
public class if01 {

	public static void main(String[] args) {
		//ê·¸ë£¹ ì¡°ê±´ : ?‘˜ ì¤? ?•˜?‚˜, ?…‹ ì¤? ?•˜?‚˜, ?„· ì¤? ?•˜?‚˜, ...
		//?‘˜ ì¤? ?•˜?‚˜(ex : ???ˆ˜ / ì§ìˆ˜)
		
		//ì¤?ë¹?  
		int number =  7;
	
		//ê³„ì‚°
		boolean isEven = number % 2 == 0;
		
		//ì¶œë ¥
		if(isEven) {
			System.out.println("ì§ìˆ˜?…?‹ˆ?‹¤");
		} 
		else {
			System.out.println("???ˆ˜?…?‹ˆ?‹¤");
		}
	}

}
