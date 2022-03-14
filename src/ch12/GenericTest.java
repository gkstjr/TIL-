package ch12;

import java.util.ArrayList;
class Audio{}
class Tv {}
public class GenericTest {
	public static void main(String[] args) {
			ArrayList<Audio> list = new ArrayList<Audio>();
//			ArrayList list = new ArrayList();
//			list.add(new Tv());
			list.add(new Audio());
	
//			Audio t = (Audio)list.get(0); //형변환 필요
			Audio t = list.get(0);
	}
}
