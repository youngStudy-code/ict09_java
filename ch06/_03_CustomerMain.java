package ch06;

// 메인 호출
public class _03_CustomerMain {

	public static void main(String[] args) {
				
	  _03_VIPcustomer vip = new _03_VIPcustomer();	
	  //_03_VIPcustomer vip = new _03_VIPcustomer("C1001", "김태희", "vip");	 
	  
	   System.out.println("---------");
	  
	  //자식을 상속하는 부모 클래스 호출
	  vip.setId("C1001");
	  vip.setName("김태희");
	  vip.setGrade("vip");
	  
	  vip.setAentID(9999);
	  vip.setSaleRatio(0.05);
	  vip.printInfo(); 
		 
	  //System.out.println("============================");
	  
	  //_03_blackCustomer bk = new _03_blackCustomer("C1002", "진상", "black");
	  
	  // bk.printInfo();
	  // bk.setPanalty(1000);
	  
	  // System.out.println("============================");
	  
	  // public _03_VIPcustomer (String id, String name,  String grade, int agentID, double saleRatio) 호출
	  // _03_VIPcustomer vip = new _03_VIPcustomer ("C1001", "김태희", "vip", 9999, 0.05);
	  
	  /* super.printInfo();super.printInfo(); // 부모 메서드 출력
	   * public void printInfo() {
	   * System.out.println("고객ID: " + id);
	   * System.out.println("고객명: " + name);
	   * System.out.println("고객등급: " + grade);
		
	   * System.out.println("vip 고객상담원ID: " + agentID);
	   * System.out.println("할인율: " + saleRatio);
	   * */
	  // vip.printInfo();
	   
	   System.out.println("================================");
	  
	   // public _03_blackCustomer (String id, String name, String grade, int agentID, double saleRatio, int panalty)
	   _03_blackCustomer bk = new _03_blackCustomer ("C1002", "홍길동", "black", 1000);
	  
	   /*
	    * super.printInfo();
	    * System.out.println("고객ID: " + id);
		* System.out.println("고객명: " + name);
		* System.out.println("고객등급: " + grade);
		* System.out.println("패널티: " + panalty);
	    * */
	   bk.printInfo();
	   
	}
}
