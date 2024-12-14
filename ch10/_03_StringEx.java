package ch10;

// AI서비스_웹과정반 @14일차
public class _03_StringEx {
	
	public static void main (String[] args) {
	
	String str = "A Barking dog"; 
	String s1, s2, s3, s4, s5;
	
	// 문자열 길이 : length ()
	System.out.println("문자열 길이 : " + str.length()); // 문자열 길이 : 13
	
	// 문자열 결합 : concat("연결할 문자열")
	s1 = str.concat(" naver Bites!");
	System.out.println("s1: " + s1); // s1: A Barking dog naver Bites!
	
	// 문자열 교환 : replace(oldChar, newChar)
	s2 = s1.replace("B", "b");
	System.out.println("s2 : " + s2); // s2 : A barking dog naver bites!
	
	// 부분 문자열: substring (bakingIndex, endIndex) => beginIndex <= 추출값 < endIndex
	// beginIndex는 0부터 시작 / endIndex = endIndex -1
	
	// 5~9사이의 값을 출력해라
	s3 = s2.substring (5,9); //띄워쓰기 포함X
	System.out.println("s3 : " + s3); // s3 : king
	
	// 대문자로 변환 : toUpperCase()
	s4 = s2.toUpperCase();
	System.out.println("s4 : " + s4); // s4 : A BARKING DOG NAVER BITES!
	
	// 소문자로 변환 : toLowerCase()
	s5 = s2.toLowerCase();
	System.out.println("s5 : " + s5); // s5 : a barking dog naver bites!
	}
}
