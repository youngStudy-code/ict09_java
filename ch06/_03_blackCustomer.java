package ch06;

// 자식 클래스 2
public class _03_blackCustomer extends _03_Customer {
	
	// 멤버변수
	private int panalty;
	
	// 매개변수 생성자
	public void _04_blackCustomer() {}
	
	// 디폴트 생성자
	public _03_blackCustomer (String id, String name, String grade, int panalty) {
		
		// 부모의 매개변수 생성자 호출
		super (id, name, grade);
		
		this.panalty = panalty;
	}
	
	// 멤버메소드 getter, setter 
	public void setPanalty (int panalty){
		this.panalty = panalty; 
	}
	
	public int getPanalty(){
		return panalty; 
	}
	
	// 멤버변수 출력, 부모메서드 재정의
	public void printInfo() {
		super.printInfo();
		System.out.println("패널티: " + panalty);
	}
}
