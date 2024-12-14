package ch09;

import java.util.Scanner;

public class throwsException { 
	
	// private static String readName()
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		/*
		 * * 1. 강제예외발생 : throw new Exception(message);
	       * 2. 상위 메서드에게 예외 던지기
	       *    throws Exception
	       * 3. 예외 처리
	       *    catch(던진 Exception e){e.getMaessage()}로 받는다.
	       * 
	       * catch문이 여러개일때(다중 catch) 부모 Exception이 제일 아래오도록 한다. 실행순서는 위에서부터 실행
		 * */
		
		try { // 정상일때 실행 (3글자 이상일 경우 실행)
			String name = readName();
			System.out.print("(정상) 이름: " + name);
			
		} catch (Exception e) { // 에러일때 실행
			//e.printStackTrace(); // 에러문 출력
			System.out.print("(오류) 메시지: " + e.getMessage());
		} finally { // 무조건 실행
			try {
				scanner.close(); 
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("<<<<정상종료>>>>>");
	}
	
	
	// 자신이 직접 처리하지 않고, 메서드를 호출한 곳으로 예외를 위임(떠넘김) 할 때 throws 키워드를 사용한다.
	// 프로그램 실행 중에 발생하는 의도치 않는 상황,즉 문제가 생기면 프로그램이 실행 도중 비정상적으로 종료되면서,
	// 나머지 코드가 실행되지 않는다그래서 자바에서는 예외 관련 클래스를 통해 프로그램을 정상적으로 종료하도록 도와주는데,
	// 이것을 바로 (예외 처리) Exception Handling이라고 한다.
	
	private static String readName() throws Exception { //2. 상위 메서드에서 예외 던지기 => throw Exception
		
		System.out.print("이름을 입력하세요 : ");
		String name = scanner.next();
		
		if(name.length()<2) { //2글자 이하일 경우 실행
			// 1. 강제예외발생: throw new Exception(message);
			throw new Exception("이름은 2글자 이상입니다.");
			// System.out.println("이름은 2글자 이상입니다."); 사용가능
			// throws의 경우 메서드 내에서 예외처리를 하지 않고 해당 메서드를 사용한 곳에서 예외 처리를 하도록 예외를 위로 던지는 것입니다. 
			// 예외를 전가하는 것 입니다.
		}
		return name;
	}
}
