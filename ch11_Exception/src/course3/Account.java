package course3;

public class Account {
	private long balance;
	
	public long getBalance() {
		return this.balance;
	}
	public void deposit(int money) {
		this.balance = money;
	}
	public void withdraw(int money) throws InsufficientException {//withdraw를 호출한 main 메서드로 InsufficientException 전달
		if (this.balance < money) {
			//사용자 예외처리(발생 = 객체 생성 + toss)
//			InsufficientException ex = new InsufficientException("잔액이 부족합니다.");
//			throw ex;
			throw new InsufficientException("잔액이 부족합니다."); // 축약
		}
		this.balance -= money;
	}
}
