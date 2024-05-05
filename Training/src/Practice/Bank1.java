package Practice;

import java.util.Scanner;

class BankAccount{
	private long accountNumber;
	private double balance;
	
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
}

public class Bank1 {
	public static void main(String[] args) {
		BankAccount acc= new BankAccount();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Account number: ");
		long accNo = s.nextLong(); 
		acc.setAccountNumber(accNo);
		System.out.println("Enter Account balance: ");
		double accBal = s.nextDouble();
		acc.setBalance(accBal);
		
		long accountNumber = acc.getAccountNumber();
		double accountBalance = acc.getBalance();
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Account Balance: " + accountBalance);
	}

}
