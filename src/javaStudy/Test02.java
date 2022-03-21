package javaStudy;

public class Test02 {
public static void main(String[] args) {
	int numOfApples = 131;
	int sizeOfBucket = 10;
	int numOfBucket = (numOfApples/sizeOfBucket)+(numOfApples%sizeOfBucket>0?1:0);
			System.out.println(numOfBucket);
}
}
