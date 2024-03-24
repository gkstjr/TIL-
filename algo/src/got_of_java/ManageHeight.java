package got_of_java;

public class ManageHeight {
	int[][] gradeHeights = new int[5][];
	
	public static void main(String[] args) {
		ManageHeight manageHeight = new ManageHeight();
		manageHeight.setData();
		for(int i = 0 ; i < 5; i++) {
//			manageHeight.printHeight(i);
			manageHeight.printAverage(i);
		}
	}
	
	public void setData() {
		gradeHeights[0] =  new int[] {170,180,173,175,177};
		gradeHeights[1] =  new int[] {160,165,167,186};
		gradeHeights[2] =  new int[] {158,177,187,176};
		gradeHeights[3] =  new int[] {173,182,181};
		gradeHeights[4] =  new int[] {170,180,165,177, 172};
			
	}
	
	public void printHeight(int classNo) {
		System.out.println("Class No.:" +classNo + 1);
		
		for(int i = 0 ; i < gradeHeights[classNo].length; i++) {
			System.out.println(gradeHeights[classNo][i]);
		}
	}
	
	public void printAverage(int classNo) {
		System.out.println("Class No.:" + (classNo + 1));
		
		double average = 0;
		
		for(int i = 0; i < gradeHeights[classNo].length; i++) {
			average += gradeHeights[classNo][i];
		}
		
		System.out.println("Height average:" + (average / gradeHeights[classNo].length));
		
	}
}
