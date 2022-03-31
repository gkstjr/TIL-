package jdbc.select;

import java.util.List;

import jdbc.beans.OlympicDto;
import jdbc.beans.ScoreDao;
import jdbc.beans.ScoreDto;

public class Test04 {
	public static void main(String[] args) throws Exception {
		ScoreDao scoreDao = new ScoreDao();
		List<ScoreDto> list = scoreDao.select();
		
		System.out.println("결과 수 " + list.size());
		for(ScoreDto scoreDto : list) {
			System.out.println(scoreDto);
		}
		
	}
}
