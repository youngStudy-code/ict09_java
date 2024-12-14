package ch08;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class _01_ArrayList {
	public static void main(String[] args) {
		
		// 선언
		// 클래스명 <데이터타입클래스> (다이아몬드 연산자) 참조변수 = new 클래스명();
		//ArrayList <String> List = new ArrayList <String>(); //다형성적용
		List <String> season = new ArrayList <String>();
		
		// new dto 생성자 추가
		// List <_02_MemberDTO dto> season = new ArrayList <_02_MemberDTO dto>();
		// season.add(dto);
		season.add("봄"); //0
		season.add("여름"); //1
		season.add("가을"); //2
		season.add("겨울"); //3
		
		System.out.println( );
		System.out.println("[방법1.for문]");
		
		//for (int i=0; i<4; i++) { => 리스트값이 존재하는 동안 변수에 대입주 출력
		for (int i=0; i<season.size(); i++) {
			System.out.println("[방법1]" + season.get(i));
		}
				
		// int[] String[] Double[]
		
		System.out.println( );
		System.out.println("[방법2. 향상된 for문]");
		// for(자료형 변수명 : 리스트명){}
		// 리스트명은 참조변수
		
		for(String ss : season){
			System.out.println(ss);
		}
		
		System.out.println( );
		System.out.println("[방법3. Interator문]");
		
		Iterator <String> iterator3 = season.iterator();
		while(iterator3.hasNext()) {
			String seasonn = iterator3.next();
			
			System.out.println(seasonn);
		}
		
		System.out.println();
		System.out.println("[방법3. 반복자 인터페이스 지정하기]");
		
		//★★★ 10. 반복자 : Iterator<E> iterator : while(hasNext())  { next() }
		//반복자 생성
		Iterator <String> iterator = season.iterator();
		
		// 리스트값이 존재하는 동안 다음값을 읽어서 출력
		while(iterator.hasNext()){ // ArrayList 값이 존재하는 체크
			String season1 = iterator.next(); // 존재하는 값을 읽어서 변수에 대입
		}
		
		// 참조변수 snacks
		
		List <String> snacks = new ArrayList <String>();
		
		snacks.add("치킨");
		snacks.add("먹태");
		snacks.add("홍합탕");
		snacks.add("육회");
		
		for(int j=0; j<snacks.size(); j++) {
			System.out.println("[안주]" + snacks.get(j));
		}
		
		System.out.println( );
		System.out.println("[방법2. 향상된 for문]");

		for(String sss : snacks) {
			System.out.println("안주:" + sss);
		}
		
		System.out.println( );
		System.out.println("[방법3. Interator문]");
		
		// 자료형이 생략시 Object형으로 변환한다.
		Iterator iterator1 = snacks.iterator(); 
		
		// Iterator <String> iterator1 = snacks.iterator(); 
		while(iterator1.hasNext()) {
			//String snacksss = iterator1.next();
			String snacksss = (String) iterator1.next();
			System.out.println(snacksss);
		}
	}
}













