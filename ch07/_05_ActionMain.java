package ch07;

// 메인클래스
public class _05_ActionMain {
	
	public static void main (String[] agrs) {
		
		System.out.println("<< 방법1. 다형성 적용, 부모는 인터페이스 >>");
		
		System.out.println(" <_06_MP3 타입 선언시> 인터페이스");
		
		/*
		음악을 연주하다.
      	음악을 멈추다.
      	문자를 보낸다.
      	문자를 받다.
      	cal : 8  
		*/
		
		_05_MP3 mp3_1 = new _05_SmartPhone();
		mp3_1.play();
		mp3_1.stop();
		
		_05_Mobile mobile_1 = new _05_SmartPhone();
		mobile_1.sendSms();
		mobile_1.receiveSms();
		
		// 다운캐스팅
		_05_SmartPhone smartPhone_1 = (_05_SmartPhone) mp3_1; 
		System.out.println("cal : " + smartPhone_1.calculate(4, 4));
		
		System.out.println(" <_06_Mobile 타입 선언시> 인터페이스");
		
		/*
		음악을 연주하다.
      	음악을 멈추다.
      	문자를 보낸다.
      	문자를 받다.
      	cal : 2 
		*/
		
		_05_MP3 mp3_2 = new _05_SmartPhone();
		mp3_2.play();
		mp3_2.stop();
		
		_05_Mobile mobile_2 = new _05_SmartPhone();
		mobile_2.sendSms();
		mobile_2.receiveSms();
		
		// 다운캐스팅 미적용, _05_SmartPhone에 상속되어있는 _05_PDA클래스에 접근한다.
		_05_PDA pda_1 = new _05_SmartPhone();
		System.out.println("cal : " + pda_1.calculate(1, 1));
		
		System.out.println(" << 방법2. 다형성 적용, 부모는 클래스 >>");
		
		/*문자를 보낸다.
      	문자를 받다.
      	음악을 연주하다.
      	음악을 멈추다.
      	cal : 5*/
		
		_05_Mobile mobile_3 = new _05_SmartPhone();
		mobile_3.sendSms();
		mobile_3.receiveSms();
		
		_05_MP3 mp3_3 = new _05_SmartPhone();
		mp3_3.play();
		mp3_3.stop();
		
		// 다운캐스팅으로 calculate 메소드 접근하기
		_05_PDA pda_2 = (_05_SmartPhone) mobile_3;
		System.out.println("cal : " + pda_2.calculate(2, 2));
	}
}
