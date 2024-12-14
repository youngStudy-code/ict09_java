package ch06;

// 생성1.자식 클래스 
public class _03_VIPcustomer extends _03_Customer {
	
	// 자식 멤버변수
	private int agentID;  
	private double saleRatio;
	
	// 매개변수 생성자가 있는 경우 디폴트 생성자 반드시 필요
	// setter-getter로 값을 주고 받을 경우에는 자동적으로 컴파일됨 (불필요) 
//	public _03_VIPcustomer() {
//		// extends _03_Customer : _03_Customer 부모클래스를 상속한다라는 함수를 사용했기에 불필요
//		// 생략시 자동적으로 컴파일 됨
//		super();
//	}
	
	// 매개변수 생성자 (매개변수값을 받는 생성자가 있는 경우 생성)
	// new _03_VIPcustomer ("C1001", "김태희", "vip", 9999, 0.05);
//	public _03_VIPcustomer (String id, String name,  String grade, int agentID, double saleRatio) {
//	
//	//부모의 매개변수 생성자 호출 
//	//super(id, name, grade); 
//	
//	// super.setId("C1001"); // 멤버변수에 직접 값 입력은 비추천 / 부모참조변수. 멤버변수 = "값"; => 멤버변수가 procted일때만 가능, private라면 불가능
//	super(id, name, grade);
//	this.agentID = agentID;
//	this.saleRatio = saleRatio;
//	}
	
	public void setAentID (int agentID) {
		this.agentID = agentID;
	}
	
	public int getAentID() {
		return agentID;
	}
	
	public void setSaleRatio (double saleRatio) {
		this.saleRatio = saleRatio;
	}
	
	public double getSaleRatio() {
		return saleRatio;
	}
	
	// Override는 재정의
	@Override  
	public void printInfo() {
		// vip.printInfo();를 통해 자식 메소드 호출 
		// 부모 클래스를 상속하기때문에 super. 를 통해 부모 클래스안에 있는 printInfo 호출
		super.printInfo();
		System.out.println("vip 고객상담원ID: " + agentID);
		System.out.println("할인율: " + saleRatio);
	}
}