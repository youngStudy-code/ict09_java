package ch08;

import java.util.ArrayList;
import java.util.List;

public class _02_ArrayList {
	public static void main (String[] args) {
	
		/*
		8. 검색 : list.indexOf(검색할 값);    // 중요
	    * => 리스트에서 검색할 값과 똑같은 값을 갖는 
	    * 첫번째 데이터를 찾아서 그 위치의 인덱스를 리턴한다.
	    * 검색할 값과 일치한 데이터가 없으면 -1을 리턴한다.
		*/
		
		// HONGILDONG
		// ArrayList 생성
	
		List <String> fullName  = new ArrayList <String>();
		
		fullName.add("H"); //0번쨰
		fullName.add("O");
		fullName.add("N");
		fullName.add("G");
		fullName.add("K");
		fullName.add("I"); //5번쨰
		fullName.add("L"); 
		fullName.add("D");
		fullName.add("O");
		fullName.add("N");
		fullName.add("G"); //10번쨰
		
		System.out.println("G문자의 인텍스 : " + fullName.indexOf("G"));
		System.out.println("N문자의 인텍스 : " + fullName.indexOf("N"));
		
		System.out.println("G문자의 마지막인텍스 : " + fullName.lastIndexOf("G"));
		System.out.println("N문자의 마지막인텍스 : " + fullName.lastIndexOf("N"));
		System.out.println("N문자의 마지막인텍스 : " + fullName.lastIndexOf("z")); //없으니까 -1
		
		System.out.println( );
		
		// for(int i=0; i<fullName.size(); i++) {
		// 항상된 for문
		for (String result1 : fullName) {
			// System.out.println(result);
			System.out.print(result1 + " ");
		}
		
		System.out.println( );
		
		// 9. 전체 삭제 : list.clear();
		fullName.remove(4);
		for (String result2 : fullName) {
			// System.out.println(result);
			System.out.print(result2 + "");
		}
		
		// 10. 전체 삭제 : list.clear();
		fullName.clear();
		for (String result2 : fullName) {
			// System.out.println(result);
			System.out.print(result2 + "");
		}
	}
}
