package ch06;

public class Test17 {
	//객체를 생성하지 않고 클래스 이름으로 바로 호출 가능
	public static void main(String[] args) {
		Printer.println(10);          // int 값을 출력
        Printer.println(true);        // boolean 값을 출력
        Printer.println(3.14);        // double 값을 출력
        Printer.println("Hello");
	}

}
