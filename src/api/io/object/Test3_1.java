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

public class Test3_1 {
	public static void main(String[] args) throws IOException {
		Lotto lotto = new Lotto();
		lotto.generate();
		
		File target = new File("files","lotto2.kh");
		FileOutputStream out = new FileOutputStream(target);
		BufferedOutputStream buffer = new BufferedOutputStream(out);
		ObjectOutputStream data = new ObjectOutputStream(buffer);
		
		data.writeObject(lotto);
		
		data.close();
	
	}
}
