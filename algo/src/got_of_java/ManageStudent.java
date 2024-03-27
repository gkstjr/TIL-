package got_of_java;

public class ManageStudent {
	public static void main(String[] args) {
		Student[] student;
		ManageStudent ms = new ManageStudent();
//		student = ms.addStudent();
//		ms.printStudents(student);
		ms.checkEquals();
	}
	
	public Student[] addStudent() {
		Student[] student = new Student[3];
		
		student[0] = new Student("kim");
		student[1] = new Student("choi");
		student[2] = new Student("park" , "sejong","010-xxxx-xxxx", "gkstjr@naver.com");
		
		return student;
	}
	
	public void printStudents(Student...student) {
		for(Student st : student) {
			System.out.println(st);
		}
		
	}
	
	public void checkEquals() {
		Student a = new Student("Min","Seoul", "010XXXXXXXX","ask@god");
		Student b = new Student("han","Seoul", "010XXXXXXXX","ask@god");
	
		if(a.equals(b)) System.out.println("Equal");
		else System.out.println("Not Equal");
	}
	
	
 }
