package Methodchain;

public class Test {

	public static void main(String[] args) {
//		//StringBuilder append()
//		StringBuilder sb = new StringBuilder();
//		sb.append("abc");
//		sb.append("def");
//		
//		sb.append("ghi").append("jkl");
//		System.out.println(sb);
		
		// Calculator - pattern  적용 후
        Calculator calc = new Calculator();
        calc.setFirst(3).setSecond(5).add().setSecond(1).sub();
	}

}
