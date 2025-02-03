package course3;

public class Test {

	public static void main(String[] args) {
		Account account = new Account();
		
		account.deposit(100000);
		System.out.println(account.getBalance());
		
		//만약 public class InsufficientException extends Exception 이렇게 접근하면
		//아래 account.withdraw는 unchecked Exception 이므로 빨간 줄 X
		try {
			account.withdraw(500000);
		} catch (InsufficientException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println(account.getBalance());

	}

}
