package Exam02;
//내부 버퍼에 문자열을 저장해두고 그 안에서 추가,수정,삭제 작업을 하도록 함.
//문자가 변경될 때마다 객체를 새로 만들지 않음
public class StringBuilderExample {
	public static void main(String[] args) {
		String data = new StringBuilder()
				//toString을 제외한 다른 메서드는 StringBuiler를 다시 리턴하므로 메소드 체이닝 가능
				.append("DEF")
				.insert(0, "ABC")
				.delete(3, 4)
				.toString();//완성된 문자열 리턴
		System.out.println(data);
	}
}
