package ch03;

// 책에 없는 내용
public class _01_StudentMain {
	
	// static - void
	// 설계도를 갖고 메인에서 갖다가 쓰겠다.
	public static void main(String args[]){
		
		// 객체 생성		
		// 클래스명 참조변수 = new 클래스명();
		_01_Student iu = new _01_Student(); 
		//hip메모리에 올라갔다->객체생성
		
		/*
		 * iu.sudentID = "S001"; 
		 * iu.name = "아이유"; 
		 * iu.email = "iu@naver.com";
		 * 
		 * iu.printerInfo();
		 */
		
		System.out.println("--------------");
		
		_01_Student ty = new _01_Student();
		
		// _01_Student 클래스안에 있는 자료형을 불러와 정보를 대입한다.
		ty.sudentID = "S002";
		ty.name = "김태영";
		ty.email = "youngdb@gmail.com";
		ty.address = "Manhattan";
	
		
		//printerInfo 메소드 안에 내용을 호출한다.
		ty.printerInfo();
		
	}
}
