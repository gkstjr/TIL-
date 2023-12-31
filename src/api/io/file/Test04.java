package api.io.file;

import java.io.File;

public class Test04 {
public static void main(String[] args) {
	
	File target = new File("./files");
	
	System.out.println(target.exists());
	System.out.println(target.isFile());
	System.out.println(target.isDirectory());

//	이름,상대경로,절대경로 등은 파일과 동일
	if(target.isDirectory()) {
		System.out.println(target.length());
		
		String[] names = target.list();
		for(String name : names) {
			System.out.println("이름 = " +name);
		}
		//내부 구성요소 파일 확인
		File[] files = target.listFiles();
		for(File file : files) {
			if(file.isFile()) {
				System.out.print("[파일]");
			}else if(file.isDirectory()) {
				System.out.print("[폴더]");
			}
			System.out.println(file.getName());
		}
	}
}
}
