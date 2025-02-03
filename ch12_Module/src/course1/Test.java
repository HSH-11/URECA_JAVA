package course1;

public class Test {
	public static void main(String[] args) {
		//Boxing
		Integer obj = 100;
		System.out.println(obj);
		
		//Unboxing
		int value = obj;
		System.out.println(value);
		
		int result = obj * value; //자동으로 연산자에 의해 unboxing
		System.out.println(result);
		
		Integer obj1 = 300;
		Integer obj2 = 300;
		System.out.println(obj1 == obj2); //false
		System.out.println(obj1.equals(obj2)); //true
		//-128~127의 수는 동일 객체로 관리
		Integer obj3 = 100;
		Integer obj4 = 100;
		System.out.println(obj3 == obj4); //true
		System.out.println(obj3.equals(obj4)); //true
		
	}
}
