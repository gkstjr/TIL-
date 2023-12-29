package api.io.object;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Test03 {
	public static void main(String[] args) throws IOException {
		
		List<Integer> numbers = new ArrayList<>();
		for(int i =0;i<=45; i++) {
			numbers.add(i);
		}
		Collections.shuffle(numbers);
		List<Integer> lotto = new ArrayList<>();
		for(int i=0; i<6; i++) {
			lotto.add(numbers.get(i));
		}
		Date d = new Date();
		
		File target = new File("files","lotto.kh");
		FileOutputStream out = new FileOutputStream(target);
		BufferedOutputStream buffer = new BufferedOutputStream(out);
		ObjectOutputStream data = new ObjectOutputStream(buffer);
		
		data.writeObject(lotto);
		data.writeObject(d);
		
		data.close();
	
	}
}
