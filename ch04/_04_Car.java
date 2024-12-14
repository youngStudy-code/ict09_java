package ch04;

public class _04_Car {
	
	// 멤버 변수
	private String brand;
	private String model;
	private int price;
	// private String color; 
	private String madein;
	
	// 생성자 => new에 의해 호출된다. 클래스이름과 같고, 반환값이 없다.
	// 1-1. 기본생성자(디폴트생성자) => 인스턴스 생성시점에 호출 
	// => 생성자가 하나도 없을때 자바 컴파일러가 자동추가
	// 매개변수 생성자가 존재시 컴파일러가 디폴트생성자를 자동추가하지 않으므로, 개발자가 추가하지 않으면 컴파일 오류 발생
	
	// 기본(디폴트) 생성자 - 자바컴파일러가 자동으로 생성
	//_04_Car cr = new _04_Car(); 생성 후 디폴트 생성자 추가 안하면 오류
	
	// 매개변수로 값을 넣어서 출력을 원할 경우에는 디폴트 생성자도 생성해야 한다.
	// _04_Car car2 = new _04_Car("제네시스", "gv80", 5000, "한국" );
	public _04_Car() {
		System.out.println("디폴트 생성자 호출");
	}
	
	
	// 매개변수 생성자, setter 각각 나눠서 멤버 메소드를 선언했지만,
	// 4개를 한번에 값을 갖고 와 멤버메소드 1개로 지정이 가능하다. 
	public _04_Car(String brand, String model, int price, String madein) {
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.madein = madein;
		// this.color = color;
	}
	
	
	// 멤버 메소드
	public void setCarNumber(String brand) {                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              
		this.brand = brand;
	}
	
	public String getCarNumber () {
		return brand;
	} 
	
	public void setCarBrand(String madein) {
		this.madein = madein;
	}
	
	public String getCarBrand() {
		return model;
	}
	
	public void setCarPrice(int price) {
		this.price  = price;
	}
	
	public void setCarMadein(String madein) {
		this.madein  = madein;
	}
	
	public int getCarPrice () {
		return price; 
	}
	
	/*
	 * public void setCarColor(String color) {
	 * this.color = color; 
	 * }
	 */
	
	/*
	 * public String getCarColor() {
	 *  return color; 
	 *  }
	 */
	
	public String getCarMadein() { 
		return madein; 
	}
	
	public void printInfo() {
		System.out.println("printInfo_브랜드: " + brand);
		System.out.println("printInfo_모델: " + model);
		System.out.println("printInfo_가격: " + price);
		System.out.println("printInfo_made in: " + madein);
		// System.out.println("색상: " + color);
	}
}
