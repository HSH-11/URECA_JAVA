package course5;

import java.io.Serializable;

//Serializable는 추상메소드가 없는 단순 Marking용도
public class Myclass implements Serializable{
	/**
	 serialVersionUID가 맞으면 직렬화를 시도
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int n;
	String str;
	
	transient String ssn;//직렬화에서 제외
	
	//serialVersionUID가 동일하면 추가된 필드가 있어도 역직렬화가 가능
	int n2;
	//serialVersionUID가 직렬화 시점의 값과 다르면 역직렿롸 불가능
}
