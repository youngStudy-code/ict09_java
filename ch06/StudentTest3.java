package ch06;

public class StudentTest3 {
	
	public static void main(String args[]) {
		
	student1 studentlee = new student1();
	
	studentlee.setStudentName("이지원");
	System.out.println(student1.serialNum);
	System.out.println(studentlee.studentName + "학번: " + studentlee.studentID);
	
	student1 studentSon = new student1();
	studentSon.setStudentName("손수경");
	
	System.out.println(student1.serialNum);
	System.out.println(studentSon.studentName + "학번: " + "studentSon.studentID");
	}
}
