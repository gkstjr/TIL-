package jdbc.select;

import java.util.List;

import jdbc.beans.OlympicDao;
import jdbc.beans.OlympicDto;

public class Test03 {
	public static void main(String[] args) throws Exception {
		OlympicDao olympicDao = new OlympicDao();
		List<OlympicDto> list = olympicDao.select();
		
		System.out.println("조회결과 수 : " + list.size());
		for(OlympicDto olympicDto : list) {
			System.out.println(olympicDto);
		}
	}
}
