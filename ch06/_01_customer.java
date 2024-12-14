package ch06;

public class _01_customer {
	
	// DTO (Data Transfer Object) : data base에 저장할때 DTO를 읽어서 진행
	// 멤버변수
	private String customerID; // 고객아이디 C001 
	private String customerName; //고객명 김태희
	private int bonusPoint; // 보너스포인트 10 
	private double bonusRate; // 포인트 적립비율 0.05
	
	
	// 디폴트 생성자
	public _01_customer() {}
	
	//                   매개변수
	public _01_customer (String id, String customerName, int bonusPoint, double bonusRate){
		
		// 멤버변수 = 매개변수
		customerID = id; // 멤버변수 = 매개변수 값이 동일할 경우 this로 구분해줌
 		this.customerName = customerName;
		this.bonusPoint= bonusPoint;
		this.bonusRate = bonusRate;
	}
	
	// 멤버메서드 getter setter		 
	public void setCustomerID (String customerID){
		this.customerID = customerID;
	}
	
	public String getCustomerID () {
		return customerID;
	}

	
	public void setCustomerName (String customerName){
		this.customerName = customerName;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	public void setBonusPoint(int bonusPoint){
		this.bonusPoint= bonusPoint;
	}
	
	public int getBonusPoint () {
		return bonusPoint;
	}
	
	public void setBonusRate (double bonusRate){
		this.bonusRate = bonusRate;
	}
	
	public double getBonusRate() {
		return bonusRate;
	}	
	
	public void printInfo() {
		System.out.println("고객아이디 \t" + customerID);
		System.out.println("고객명 \t\t" + customerName);
		System.out.println("보너스포인트 \t" + bonusPoint);
		System.out.println("포인트 적립비율 \t" + bonusRate);
	}
	
	public void printInfo1(String customerID, String customerName, int bonusPoint, double bonusRate) {
		System.out.println("고객아이디 \t" + customerID);
		System.out.println("고객명 \t\t" + customerName);
		System.out.println("보너스포인트 \t" + bonusPoint);
		System.out.println("포인트 적립비율 \t" + bonusRate);
	}
}
