package ch06;

// 부모클래스
public class _02_Car {
	
		// 멤버 변수
		private String kind; // 종류 소방차 경찰차
		private int speed; // 스피드 80 100
		private String color; // 색깔 red white
		
		// default 생성자 출력
		public _02_Car() {
			System.out.println("<<<< 1. 부모클래스 호출 >>>>");
		}	
		
		// 멤버 메서드
		public void setCar (String kind){
			this.kind = kind;
		}
		
		// 멤버 메서드
		public String getCar() {
			return kind;
		}
		
		// 멤버 메서드
		public void setSpeed (int speed){
			this.speed = speed;
		}
		
		// 멤버 메서드
		public int getSpeed() {
			return speed;
		}
		
		// 멤버 메서드
		public void setColor (String color){
			this.color = color;
		}
		
		// 멤버 메서드
		public String getColor(){
			return color;
		}
		
		// 출력 메서드
		public void printInfo() {
			System.out.println("종류: " + kind);
			System.out.println("스피드: " + speed);
			System.out.println("색깔: " + color);
		}
}
