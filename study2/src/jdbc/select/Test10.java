package jdbc.select;

import jdbc.beans.OlympicDao;
import jdbc.beans.OlympicDto;
  
public class Test10 {
	public static void main(String[] args) throws Exception {
		int rank = 99;
		
		OlympicDao olympicDao = new OlympicDao();
		OlympicDto olympicDto = olympicDao.selectOne(rank);
		
		if(olympicDto!=null) {
			System.out.println(olympicDto);
			
		}else {
			System.out.println("검색 번호가 없음");
		}
	}
}
