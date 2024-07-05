package Package2;

import java.util.Scanner;

public class BankDeposit extends Thread{
	private long accountNo;
	private long balance;
	
	BankDeposit(){
	}
	
	public BankDeposit(long accountNo, long balance) {
		super();
		this.accountNo = accountNo;
		this.balance = balance;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the account number: ");
		long accNo = s.nextInt();
		System.out.println("Enter the Initial amount: ");
		long amount = s.nextInt();
		BankDeposit b1 = new BankDeposit(accNo, amount);
		Thread t1 = new Thread(b1);
		t1.setName("First");
		Thread t2 = new Thread(b1);
		t2.setName("Second");
		t1.start();
		t2.start();
	}

	public void run() {
		display(accountNo, getDeposit(balance));
	}

	synchronized long getDeposit(long balance2) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the deposit amount: ");
		long bal2 = s.nextInt();
		balance2 = balance2 + bal2;
		return balance2;
	}

	void display(long accountNo2, long balance2) {
		System.out.println("Account No: " + accountNo2);
		System.out.println("Balance: " + balance2);
		System.out.println(Thread.currentThread());
	}
}
