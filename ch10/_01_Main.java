package ch10;

//AI서비스_웹과정반 @14일차
public class _01_Main {
	public static void main (String[] args) {
		
	// 새로운 생성자로 생성 안하고 클래스에서 getInstance 생성자 호출
	// static 메서도 접근 : 클래스명, static 메서드()
		
	_01_Company hong = _01_Company.getInstance();
	hong.gotoWork("홍길동");
	hong.work("홍길동");
	hong.gotoCafeteria("홍길동");
	hong.gotoHome("홍길동");
	System.out.println(" ");
	
	_01_Company kim = _01_Company.getInstance();
	kim.gotoWork("김태희");
	kim.work("김태희");
	kim.gotoCafeteria("김태희");
	kim.gotoHome("김태희");
	
	System.out.println();
	
	System.out.println(hong == kim);
	}
}
