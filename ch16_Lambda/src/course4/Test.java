package course4;

public class Test {

	public static void main(String[] args) {
		Person person = new Person();
		//정적 메소드 참조
		//person.action((x,y)-> Computer.staticMethod(x,y);
		//파라미터와 그 사용이 명확할 때
		person.action(Computer::staticMethod);
		
		//인스턴스 메소드
		Computer computer = new Computer();
		person.action(computer::instanceMethod);
		
		person.action((x,y) -> computer.instanceMethod(x, y));
	}

}
