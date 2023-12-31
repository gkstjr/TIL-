package ch10;

import java.util.Calendar;

public class Test1 {
public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.set(2020, 0,1);
		
		for(int i=0;i<12;i++) {
			int weekday = cal.get(Calendar.DAY_OF_WEEK);
			
			int secondSunday = (weekday==1) ? 8 : 16-weekday;
		
//			cal.set(ca, secondSunday);
		
		}
}
}
