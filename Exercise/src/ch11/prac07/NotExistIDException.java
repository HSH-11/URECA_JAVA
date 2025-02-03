package ch11.prac07;

public class NotExistIDException extends Exception {
	public NotExistIDException() {
	}

	public NotExistIDException(String message) {
		super(message);
	}
}
