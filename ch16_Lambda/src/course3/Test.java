package course3;

public class Test {
	
	//return이 있는 람다식
	public static void main(String[] args) {
		Person person = new Person();
		
		person.action((x,y)-> {
			return x+y;
		});
		//{}과 return문 생략하고 결과 리턴
		person.action((x,y) -> x-y);
		
		//나눗셈 (메소드 사용)
		person.action((x, y) -> div(x,y)); 
	}
	
	public static int div(int x, int y) {
		return x / y;
	}

}
