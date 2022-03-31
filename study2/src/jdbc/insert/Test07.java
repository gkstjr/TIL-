package jdbc.insert;

import jdbc.beans.OlympicDao;
import jdbc.beans.OlympicDto;

public class Test07 {
	public static void main(String[] args) throws Exception {
		OlympicDto olympicDto = new OlympicDto();
		
		olympicDto.setRank(66);
		olympicDto.setName("포켓몬스터");
		olympicDto.setGold(2);
		olympicDto.setSilver(1);
		olympicDto.setBronze(1);
		
		OlympicDao olympicDao = new OlympicDao();
		olympicDao.insert(olympicDto);
		
		System.out.println("등록 완료");
	}
}
