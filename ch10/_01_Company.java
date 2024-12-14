package ch10;

//AI서비스_웹과정반 @14일차
public class _01_Company {
	
	// 멤버변수
	public String worker; 
	
	// 1단계 디폴트생성자를 private로 만들기 
	// 싱글톤은 객체 1번 실행
	private _01_Company() {
		System.out.println("<기본생성자>");
	} 
	
	// ★
	// 2단계. 클래스 내부에 static으로 유일한 인스턴스 생성하기
	// (main에서 여러개 선언하는 대신 대표로 1개만 지정해라)
	static _01_Company instance = new _01_Company();
	
	public static _01_Company getInstance() {
		
		if(instance == null) {
			// 동시접속시 문제가 생기면 내가 해결 해줄게
			System.out.println("null입니다.");
			instance = new _01_Company();
			
		}
		return instance;
	}
	
	// 멤버메소드 
	// 출근하다.
	public void gotoWork (String worker) {
		System.out.println(worker + " 출근하다.");
	}
	
	//일하다. work (String worker)
	public void work (String worker) {
		System.out.println(worker + " 일하다.");
	}
	
	//점심먹다. gotoCafeteria (String worker)
	public void gotoCafeteria (String worker) {
		System.out.println(worker + " 점심먹다.");
	}
	
	//일하다. gotoHome (String worker)
	public void gotoHome (String worker) {
		System.out.println(worker + " 일하다.");
	}
	
	 /* p193  
	 * [면접] 싱글톤패턴
	 * - 인스턴스를 단 하나만 생성하는 디자인 패턴
	 * - static을 응용하여 프로그램 전반에서 사용하는 동일한 인스턴스를 하나만 생성하는 방식
	 * - 접근할 클래스에 여러 메서드가 있을 때, 외부 클래스가 해당 메서드에 접근할 때마다 
	 *   객체를 생성할 필요없이 getInstance()를 통해 참조변수만 리턴받아 접근한다.
	 *   열번, 백번을 호출해도 항상 같은 주소의 인스턴스가 반횐된다.
	 *  
	 * 싱글톤패턴 생성
	 * - 1단계. 디폴트생성자를 private으로 만들기
	 * - 2단계. 클래스 내부에 static으로 유일한 인스턴스 생성하기
	 * - 3단계. 외부에서 참조할 수 있는 public 메서드 만들기
	 * 
	 * 호출
	 * - 접근클래스명 참조변수 = 접근클래스명.getInstance();
	 * 예) _08_Company com1 = _08_Company.getInstance();  // 클래스명.메서드명
	 */
	 
	}
