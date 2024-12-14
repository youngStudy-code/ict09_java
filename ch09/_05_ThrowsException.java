package ch09;

import java.util.Scanner;

public class _05_ThrowsException {
	
	private static Scanner scanner  = new Scanner(System.in);
	// private static int resultAge;
	
	public static void main (String[] args) {
		
		/*
		 * [나이가 0보다 작을때]
		나이를 입력하세요 : -1
		메시지 : 나이는 0보다 큽니다.!!
		정상종료^^
		*/
		   
		/* 
		 * [나이가 0보다 클때]
		나이을 입력하세요 : 25
		나이 : 25
		정상종료^^
		*/ 
		
		int resultAge = 0;
		
		try { //정상일때
			resultAge = readAge();
		} catch(Exception e) { 
			System.out.println("메시지: " + e.getMessage()); // Exception 오류일때 예외처리
		} finally {
			System.out.println("정상종료^^");
			scanner.close();
		}
	} 
	
	// 정상일때 실행하는 메소드
	private static int readAge() throws Exception {
		
		System.out.print("나이를 입력하세요: ");
		int age = scanner.nextInt();
		
		if(age>0) {
			System.out.println("나이 : " + age);
		} else {
			throw new Exception("나이는 0보다 큽니다.!!"); // return 값 안 넘거져 줌
		}
		return age;
	}
}