package ch06;

public class Account_2 {
	private String account_number;
	private String owner;
	private int balance;
	
	public Account_2(String account_number, String owner, int balance) {
		this.account_number = account_number ;
		this.owner = owner;
		this.balance = balance;
	}
	
	public String getaccount_number() { return account_number; }
	public void setaccount_number(String account_number) { this.account_number = account_number; }
	public String getOwner() { return owner; }
	public void setOwner(String owner) { this.owner = owner; }
	public int getBalance() { return balance; }
	public void setBalance(int balance) { this.balance = balance; }
}
