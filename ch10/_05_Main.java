package ch10;

import java.util.ArrayList;
import java.util.List;

public class _05_Main {
	
	   public static void main(String[] args) {
		   
	      // 매개변수 생성자로 값 전달
	      _05_EnumEx ani1 = new _05_EnumEx(Animal.CAT, "고양이");
	      _05_EnumEx ani2 = new _05_EnumEx(Animal.DOG, "강아지");
	      _05_EnumEx ani3 = new _05_EnumEx(Animal.FISH, "물고기");
	      
	      // 리스트 생성
	      List<_05_EnumEx> list = new ArrayList<_05_EnumEx>();
	      // List<클래스> list = new ArrayList<클래스>();
	      
	      // 리스트에 담는다
	      list.add(ani1); 
	      list.add(ani2); 
	      list.add(ani3); 
	      
	      System.out.println(ani1); // CAT:고양이
	      System.out.println(ani2); // DOG:강아지
	      System.out.println(ani3); // FISH:물고기
	      
	      // 향상된 for-each문으로 출력
	      for(_05_EnumEx ani4 : list) {
	         // System.out.println(ani4.getKind() + " : " + ani4.getName());
	         System.out.println(ani4.toString());
	      }
	   }
	}