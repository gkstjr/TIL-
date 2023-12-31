package api.io.single;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test03 {
public static void main(String[] args) throws Exception {
//	파일 복사 프로그램
	
//	준비물 : 입력 파일 객체, 입력 스트림 객체, 출력 파일 객체, 출력 스트림 객체
//	구조 : [single.kh]->origin->in->[프로그램]->out->target->[copy.kh]
	
	File origin = new File("files","single.kh");
	FileInputStream in = new FileInputStream(origin);
	
	File target = new File("files","copy.kh");
	FileOutputStream out = new FileOutputStream(target);
	
	while(true) {
		int data = in.read();
		if(data==-1)break;
		out.write(data);
	}
	
	
	in.close();
	out.close();
	
}
}
