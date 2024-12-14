package ch02;

import java.util.Scanner;

public class _18_DoWhileEx {
	
	// str은 문자열을 담은 문자형
	public static void main(String[] args) {

		// 클래스명 변수 = new 클래스명();
		
		
		// import java.util.Scanner;
		// Scanner이라는 자료형 sc 변수형 
		// console에서 값을 입력 받는 클래스 (System.in)
		Scanner sc = new Scanner(System.in);
		
		//System.out.print("월을 입력하세요. : ");
		
		// int month = 콘솔입력값; 
		// scan.nextInt() = 월 입력 값 
		//int month = sc.nextInt(); 
		
		//System.out.println("입력월 : " + month + "월"); 

		
		/*
		 * 벗어난 경우 => 잘못된 월 입니다. (1~12월) 출력, 월 입력 받으세요.
		 * 정상인 경우 => 입력 월 출력
		 * */
		/*
		 * do { //콘솔창에 값을 입력 받겠다. Scanner scn = new Scanner(System.in);
		 * System.out.print("월을 입력해 주세요 : ");
		 * 
		 * // 입력 받은 값을 month12에 결합한다. month12 = scn.nextInt();
		 * 
		 * if(month12>=1 && month12<=12){ System.out.println("입력 하신 월은 : " + month12 +
		 * "월 입니다."); // 정상일 경우 출력 } else {
		 * System.out.println("잘못된 월 입니다. (1~12월) 출력, 월 입력 받으세요." + month12); } }
		 * while(true);
		 */		
		
		// 월 자료형 선언
		int month;
		// 첫 입력 값 입력
		System.out.println("월을 입력하세요. : ");
		
		// do - while문 : do는 무조건 1회 실행 후 while 문 실행 (조건 만족 시 do 문 다시 실행) 
		do { 
			// 콘솔 창에 입력하는 값을 moth 변수가 받는다.
			month = sc.nextInt();
			
			// month가 7일 경우, 충족
			// month가 15일 경우, 미충족
			if (month>=1 && month<=12) {
				// 충족 시 바로 if 조건문을 빠져나간다.
				break; 
			}
			// if문을 충족 했기에 실행하지 않는다.
			// if문 미 충족 했기에  실행한다.
			// while문 실행 후 do문으로 다시 돌아와 잘못된 월 입니다. 실행
			System.out.print("잘못된 월 입니다. (1~12월 입력), 월 입력 받으세요. : " + month);
			} 
		// while 조건식 실행, month값 7은 while문에 미 충족 한다.
		// while 조건식 실행, month값 15은 while문에 충족 한다. while문 조건식이 참이면 다시 do조건문을 수행한다.
		while(month <= 0 || month >= 13); 
		// 입력하신 월: ~ 실행 후 입력 종료
			System.out.print("입력하신 월 : " + month + "월 입니다.");
			sc.close();
		}
	}