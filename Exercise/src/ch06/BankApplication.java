package ch06;

import java.util.Scanner;

public class BankApplication {
		private static Account_2[] accountArray = new Account_2[100];
		private static Scanner sc = new Scanner(System.in);
		
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("----------------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("----------------------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = Integer.parseInt(sc.nextLine());
			if (selectNo == 1) {
				createAccount();		
			}else if(selectNo == 2) {
				accountList();
			}else if(selectNo == 3) {
				deposit();
			}else if(selectNo == 4) {
				withdraw();
			}else if(selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");	
	}
	
	//계좌 생성
	private static void createAccount() {
		System.out.println("--------------");
		System.out.println("계좌생성");
		System.out.println("--------------");
		
		System.out.print("계좌번호: ");
		String account_number = sc.nextLine();
		System.out.print("계좌주: ");
		String owner = sc.nextLine();
		System.out.print("초기입금액: ");
		int balance = Integer.parseInt(sc.nextLine());
		
		Account_2 newAccount = new Account_2(account_number,owner,balance);
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i] == null) {
				accountArray[i] = newAccount;
				System.out.println("결과 계좌가 생성되었습니다");
				break;
			}
		}
	}
	//계좌 리스트 조회
	private static void accountList() {
		System.out.println("--------------");
		System.out.println("계좌목록");
		System.out.println("--------------");
		for(int i=0; i<accountArray.length; i++) {
			Account_2 account = accountArray[i];
			if (account != null) {
				System.out.print(account.getaccount_number());
				System.out.print(" ");
				System.out.print(account.getOwner());
				System.out.print(" ");
				System.out.print(account.getBalance());
				System.out.println();
			}
		}
	}
	//출금
	private static void withdraw() {
		System.out.println("--------------");
		System.out.println("출금");
		System.out.println("--------------");
		System.out.print("계좌번호: ");
		String account_number = sc.nextLine();
		System.out.print("출금액: ");
		int money = Integer.parseInt(sc.nextLine());
		
		Account_2 account = findAccount(account_number);
		account.setBalance(account.getBalance() - money);
		System.out.println("결과: 출금이 성공되었습니다.");
	}
	//예금
	private static void deposit() {
		System.out.println("--------------");
		System.out.println("예금");
		System.out.println("--------------");
		System.out.print("계좌번호: ");
		String account_number = sc.nextLine();
		System.out.print("예금액: ");
		int money = Integer.parseInt(sc.nextLine());
		
		Account_2 account = findAccount(account_number);
		account.setBalance(account.getBalance() + money);
	}
	
	private static Account_2 findAccount(String an) {
		Account_2 account = null;
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i] != null) {
				String info = accountArray[i].getaccount_number();
				if(info.equals(an)) {
					account = accountArray[i];
					break;
				}
			}
		}
		return account;
		}	
}
