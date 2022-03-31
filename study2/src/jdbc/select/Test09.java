package jdbc.select;

import java.util.List;

import jdbc.beans.ExamDao;
import jdbc.beans.ExamDto;

public class Test09 {
	 public static void main(String[] args) throws Exception {
		String type = "type";
		String keyword = "문제";
		
		ExamDao examDao = new ExamDao();
		List<ExamDto> list = examDao.selectList(type,keyword);
		
		if(list.isEmpty()) {
			System.out.println("검색 결과가 없음");
		}else {
			for(ExamDto examDto : list) {
				System.out.println(examDto);
			}
		}
	}
}
