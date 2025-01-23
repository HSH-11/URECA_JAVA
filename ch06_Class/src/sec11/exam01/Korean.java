package sec11.exam01;
	//Final 필드 선언 시에 초기 값 줄 수 있는 방법
	//1.필드 선언 시에 대입 2.생성자에서 초기값 대입
public class Korean {
	final String nation = "대한민국";
	final String ssn;
	
	String name;
	
	public Korean(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}
