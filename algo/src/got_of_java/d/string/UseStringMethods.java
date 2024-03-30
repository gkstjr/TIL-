package got_of_java.d.string;

import java.io.PrintWriter;

public class UseStringMethods {
	public static void main(String[] args) {
		UseStringMethods use = new UseStringMethods();
		String str = "The String class represents character strings.";
		use.printWords(str);
		use.findString(str, "string");
		use.findAnyCaseString(str, "string");
		use.countChar(str, 's');
		use.printContainWords(str, "ss");
	}
	
	public void printWords(String str) {
		
		String[] arr = str.split(" ");
		
		for(String st : arr) {
			System.out.println(st);
		}
	}
	
	public void findString(String str , String findStr) {
		
		int index = str.indexOf(findStr);
		System.out.println("string is appeared at " + index);
	}
	
	public void findAnyCaseString(String str , String findStr) {
		int index = str.toLowerCase().indexOf(findStr);
		System.out.println("string is appeared at " + index);
	}
	
	public void countChar(String str , char c) {
		char[] ch = str.toCharArray();
		int index = 0;
		for(char v : ch) {
			if(v == c) index++;
		}
		System.out.println("char '" + c +"' count is " + index);
	}
	
	public void printContainWords(String str , String findStr) {
		String[] arr = str.split(" ");
		
		for(String s : arr) {
			if(s.contains(findStr)) System.out.println("class contains " + findStr);
		}
	}
}
