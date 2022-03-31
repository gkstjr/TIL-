package jdbc.update;

import jdbc.beans.OlympicDao;
import jdbc.beans.OlympicDto;

public class Test02 {
	public static void main(String[] args) throws Exception {
		OlympicDto olympicDto = new OlympicDto();
		olympicDto.setRank(1);
		olympicDto.setName("노르웨이");
		olympicDto.setGold(10);
		olympicDto.setSilver(20);
		olympicDto.setBronze(10);
		
				OlympicDao olympicDao = new OlympicDao();
				boolean success = olympicDao.update(olympicDto);
				
				if(success)
				System.out.println("변경완료!");
				else System.out.println("변경 실패");
	}
}
