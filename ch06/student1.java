package ch06;

public class student1 {
	
		 static int serialNum = 1000;
		 int studentID;
		 String studentName;
		 int grade;
		 String address;
		 
		 public student1() {
			 serialNum++;
			 studentID = serialNum;
		 }
		
		public int getStudentName() {
			return serialNum;
		}
		
		public void setStudentName(String studentName) {
			this.studentName = studentName;
		}
	}	
