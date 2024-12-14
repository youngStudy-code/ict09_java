package ch03;

public class _04_HouseMain {
	
	/*
	 * 객체(인스턴스) 생성 
	 * 클래스명 참조변수 = new 클래스명(); //참조변수:주소 = new 클래스명(): 집
	 * 참조변수.멤버메소드;
	 */
	
	public static void main(String args[]) {
		_04_House hm = new _04_House();
		
		hm.setAddress("강남구");
		hm.setPrice(4656156);
		hm.setkKind("삼성아파트");
		hm.setSize(24);
		
		hm.setPrintInfo();
	}

}
