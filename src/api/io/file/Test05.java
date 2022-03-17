package api.io.file;

import java.io.File;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		File position = new File(".");
//		System.out.println(position.exists());
		Scanner sc = new Scanner(System.in);
		while(true) {
			File[] files = position.listFiles();
			Comparator<File> c = new Comparator<File>() {
				
				@Override
				public int compare(File o1, File o2) {
					if(o1.isDirectory()&&o2.isDirectory()) {
						return o1.getName().compareTo(o2.getName());
					}else if(o1.isDirectory()&&o2.isFile()) {
						return -1;
						
					}else if(o1.isFile()&&o2.isDirectory()) {
						return 1;
					}else {
						return o1.getName().compareTo(o2.getName());
					}
				}
				
			};
			Arrays.sort(files, c);
			
			System.out.println("------탐색기-------");
			for(File f : files) {
				System.out.println(f.getName());
			}
			
			System.out.print("입력 : ");
			String command = sc.nextLine();
			if(command.equals("종료")) {
				break;
			}
			
			File target = new File(position,command);
			if(target.exists()) {
				if(target.isFile()) {
					System.out.println("파일 선택!");
					System.out.println("이름 " + target.getName());
					System.out.println("크기 " + target.length());
				}else if(target.isDirectory()) {
					position = target;
				}
			}else {
				System.out.println("존재하지 않는 대상입니다");
			}
			
		}
		sc.close();
	}
}
