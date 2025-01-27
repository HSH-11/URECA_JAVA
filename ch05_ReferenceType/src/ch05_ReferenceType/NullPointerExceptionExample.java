package ch05_ReferenceType;

public class NullPointerExceptionExample {
	public static void main(String[] args) {
		int[] intArray = null;
		//intArray[0] = 10;	 //NullPointerException
		//why? intArray가 참조하는 배열 객체가 없기 때문

		String str = null;
		//System.out.println("총 문자수: " + str.length() );	  //NullPointerException
		//String도 마찬가지
	}
}
