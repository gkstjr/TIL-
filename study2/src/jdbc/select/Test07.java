package jdbc.select;

import java.util.List;

import jdbc.beans.OlympicDao;
import jdbc.beans.OlympicDto;

public class Test07 {
	public static void main(String[] args) throws Exception {
			String keyword = "국";
		
			OlympicDao olympicDao = new OlympicDao();
			List<OlympicDto> list = olympicDao.selectList(keyword);
			
			for(OlympicDto olympicDto : list) {
				System.out.println(olympicDto);
			}
			
	}
}
