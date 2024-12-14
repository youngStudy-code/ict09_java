package ch04;

public class _05_StudentMain {
	
	public static void main(String args[]) {
	
		_05_Student lee = new _05_Student();
		
		lee.setName("이지원");
		
		System.out.println("serial : " + _05_Student.serialNum); // serialNum:1001
		System.out.println("이름 : " + lee.getName());
		System.out.println("학번 : " + lee.getStudentId());
		System.out.println(" ");
		
		_05_Student son = new _05_Student();
		
		son.setName("손수경");
		
		// 중복되지 않게 바꾸기: static 클래스 함수
		System.out.println("serial : " + _05_Student.serialNum); // serialNum:1002
		System.out.println("이름 : " + son.getName());
		System.out.println("학번 : " + son.getStudentId());
		System.out.println(" ");
		System.out.println(_05_Student.getSerialNum());
	}
}
