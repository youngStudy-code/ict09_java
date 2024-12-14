package ch03;

public class _03_MyInfo {
	
	//설계도에는 메인 사용 X

		// 멤버변수 (속성)
		private String name;
		private String birthDay;
		private int money;
		private String address; 
		
		// 멤버메서드 (기능)
		// setter
		public void setName (String name) {
			this.name = name;
		}
		
		public void setBirthDay (String birthDay) {
			 this.birthDay = birthDay;
		}
		
		public void setMoney (int money) {
			 this.money = money;
		}
		
		public void setAdddress (String adddress) {
			this.address = adddress;
		}
		
		// 멤버메소드 (출력정보)
		public void printInfo(){
			System.out.println(name);
			System.out.println(birthDay);
			System.out.println(money);
			System.out.println(address);
		}
}