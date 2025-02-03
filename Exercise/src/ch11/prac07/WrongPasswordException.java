package ch11.prac07;

public class WrongPasswordException extends Exception {
	public WrongPasswordException() {
	}

	public WrongPasswordException(String message) {
		super(message);
	}
}