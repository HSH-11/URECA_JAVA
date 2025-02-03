package course3;
//사용자 정의 예외
public class InsufficientException extends Exception {
	public InsufficientException() {} //자동 생성
	public InsufficientException(String message) {
		super(message); //Exception 클래스의 생성자 이용
	}
}
