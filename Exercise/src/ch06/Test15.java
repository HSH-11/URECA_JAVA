package ch06;

public class Test15 {

	public static void main(String[] args) {
		
		MemberService ms = new MemberService();
		
		System.out.println(ms.login("hong","12345"));
		ms.logout("hong");
	}

}
