package api.io.object;

import java.io.Serializable;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Lotto implements Serializable {
//  객체 입출력을 위한 클래스
//	=자격요건을 획득해야 객체 입출력이 가능(java.io.Serializable 상속)
	private List<Integer> lotto;
	private Date time;
	
	public void generate() {
		List<Integer> numbers = new ArrayList<>();
		for(int i =0;i<=45; i++) {
			numbers.add(i);
		}
		Collections.shuffle(numbers);
		lotto = new ArrayList<>();
		for(int i=0; i<6; i++) {
			lotto.add(numbers.get(i));
		}
		time = new Date();
	}
	public void print() {
		Format f = new SimpleDateFormat("y년M월d일 E요일 a h시 m분 s초");
		System.out.println(lotto);
		System.out.println(f.format(time));
		
	}
}
