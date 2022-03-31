package jdbc.select;

import java.util.List;

import jdbc.beans.ExamDao;
import jdbc.beans.ExamDto;

public class Test05 {
	public static void main(String[] args) throws Exception {
		ExamDao examDao = new ExamDao();
		List<ExamDto> list = examDao.selectList();
		
		for(ExamDto examDto : list) {
			System.out.println(examDto);
		}
	}
}
