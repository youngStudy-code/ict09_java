package ch06;

// 부모클래스(공통)
public class _01_Animal {
	
	// 공통 멤버 변수
	private String kind; // 종류 고양이
	private int lengs; // 다리 4개
	private int weight; // 체중 5

	
	// 멤버 메서드
	public void setKind(String kind) {
		this.kind = kind;
	}
	
	public String getKind() {
		return kind;
	}
	
	public void setLengs(int lengs) {
		this.lengs = lengs;
	}
	
	public int getLengs() {
		return lengs;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public void PrintInfo() {
		System.out.println("종류 " + kind);
		System.out.println("다리 " + lengs + "개"); 
		System.out.println("체중 " + weight);
	}

}
