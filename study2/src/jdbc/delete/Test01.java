package jdbc.delete;

import jdbc.beans.OlympicDao;

public class Test01 {
	public static void main(String[] args) throws Exception {
//		olympic 국가 정보 삭제
		String name = "포켓몬스터";
//		준비 
		OlympicDao olympicDao = new OlympicDao();
		boolean success = olympicDao.delete(name);
		
		if(success)System.out.println("성공적으로 삭제됨");
		else System.out.println("삭제안됨");
	}
}
