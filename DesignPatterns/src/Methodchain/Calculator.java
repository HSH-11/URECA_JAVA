package Methodchain;
//메소드 체이닝: 객체의 메서드가 자기 자신을 반환하여 여러 개의 메서드를 한 줄에서 연결해서 호출할 수 있도록 한다.
public class Calculator {
	private int first;
	private int second;

	// pattern 적용 전
//	public void setFirst(int first) {
//		this.first = first;
//	}
//	
//	public void setSecond(int second) {
//		this.second = second;
//	}
//	
//	public void add() {
//		System.out.println(this.first + this.second);
//	}
//	public void sub() {
//		System.out.println(this.first - this.second);
//	}
	// pattern 적용 후
	public Calculator setFirst(int first) {
		this.first = first;
		return this;
	}

	public Calculator setSecond(int second) {
		this.second = second;
		return this;
	}

	public Calculator add() {
		System.out.println(this.first + this.second);
		return this;
	}

	public Calculator sub() {
		System.out.println(this.first - this.second);
		return this;
	}
}
