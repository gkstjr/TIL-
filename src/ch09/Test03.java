package ch09;

import java.util.Objects;

class Card2 {
	String kind;
	int number;
	
	Card2(){
		this("SPADE", 1);
	}
	Card2(String kind , int number) {
		this.kind= kind;
		this.number = number;
	}

	public String toString() {
		return "kind : " + kind + "number : " + number;
	}

	public int hascode() {
		return Objects.hash(kind,number);
	}

	public boolean equals(Object obj) {
		Card2 c = new Card2();
//		if(!(obj instanceof c)) 
			return false;
	}

}








public class Test03 {
	public static void main(String[] args) {
		
	}	
}

