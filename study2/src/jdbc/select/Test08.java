package jdbc.select;

import java.util.List;

import jdbc.beans.ScoreDao;
import jdbc.beans.ScoreDto;

public class Test08 {
	public static void main(String[] args) throws Exception {
		String name = "슬";
		
		ScoreDao scoreDao = new ScoreDao();
		List<ScoreDto> list = scoreDao.selectList(name);
		
		for(ScoreDto scoreDto : list) {
			System.out.println(scoreDto);
		}
		
	}
}
