package ch02;

public class _05_IfEx {

	public static void main (String args[]) {
		/*
	      switch(조건) {
	            case 값1 : 수행문1;
	                break;
	            case 값2 : 수행문2;
	                break; 
	            case 값3 : 수행문3;
	                break;             
	            default: 수행문4;
	      }
	      */
		
	      // ranking에 따른 금메달 출력
	      // ranking 1:"금메달", 2:"은메달", 3:"동메달", 그외 "참가상"  => 결과 : 순위 :1, 메달:금메달
	    
		// 순위
		int ranking = 1;
		// 메달
		String medal = ""; 
		
		switch(ranking) {
			case 1 : medal = "금메달";
			break;
			
			case 2 : medal = "은메달";
			break;
			
			case 3 : medal = "동메달";
			break;
			
			default : medal = "참가상";
			break;
		}
		System.out.println("순위 " + ranking + "등 " + medal);
	}
}
