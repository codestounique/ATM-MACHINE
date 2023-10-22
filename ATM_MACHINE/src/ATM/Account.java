package ATM;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
	Scanner input = new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
	private int customerNumber;
	private int pinNumber;
	private double checkingBalance = 0;
	private double savingBalance = 0;

	public double getCheckingBalance() {
		return checkingBalance;
	}

	public void setCheckingBalance(double checkingBalance) {
		this.checkingBalance = checkingBalance;
	}

	public double getSavingBalance() {
		return savingBalance;
	}

	public int getCustomerNumber() {

		return customerNumber;
	}

	public int getPinNumber() {

		return pinNumber;
	}

	public void setPinNumber(int pinNumber) {

		this.pinNumber = pinNumber;
	}

	public void setCustomerNumber(int customerNumber) {

		this.customerNumber = customerNumber;
	}

	/* Calculate checking account withdrawal */
	public void calcCheckingWithdraw(double amount) {
		checkingBalance = (checkingBalance - amount);
	}

	/* Calculate saving account withdrawal */
	public void calcSavingWithdraw(double amount) {
		savingBalance = (savingBalance - amount);
	}

	/* Calculate checking account deposit */
	public void calcCheckingDeposit(double amount) {
		checkingBalance = (checkingBalance + amount);
	}

	/* Calculate saving account deposit */
	public void calcSavingDeposit(double amount) {
		savingBalance = (savingBalance + amount);
	}

	/* Customer checking account withdraw input */
	public void getCheckingWithdrawInput() {
		System.out.println("Checking Account Balance:" + moneyFormat.format(checkingBalance));
		System.out.println("Amount you want to withdraw from checking account:: ");
		double amount = input.nextDouble();

		if ((checkingBalance - amount) >= 0) {
			calcCheckingWithdraw(amount);
			System.out.println("New Checking Account Balance:" + moneyFormat.format(checkingBalance));
		} else {
			System.out.println("Balance cannot be negative." + "\n");
		}
	}

	/* Customer saving account withdraw input */
	public void getSavingWithdrawInput() {
		System.out.println("Saving Account Balance:" + moneyFormat.format(savingBalance));
		System.out.println("Amount you want to withdraw from saving account:");
		double amount = input.nextDouble();

		if ((savingBalance - amount) >= 0) {
			calcSavingWithdraw(amount);
			System.out.println("New Saving Account Balance:" + moneyFormat.format(savingBalance));
		} else {
			System.out.println("Balance cannot be negative." + "\n");
		}
	}

	/* Customer checking account deposit */
	public void getCheckingDepositInput() {
		System.out.println("Checking Account Balance:" + moneyFormat.format(checkingBalance));
		System.out.println("Amount you want to deposit from checking account:");
		double amount = input.nextDouble();

		if ((checkingBalance + amount) >= 0) {
			calcCheckingDeposit(amount);
			System.out.println("New Checking Account Balance:" + moneyFormat.format(checkingBalance));
		} else {
			System.out.println("Balance cannot be negative." + "\n");
		}
	}

	public void getSavingDepositInput() {
		System.out.println("Saving Account Balance:" + moneyFormat.format(savingBalance));
		System.out.println("Amount you want to withdraw from saving account:");
		double amount = input.nextDouble();
		if ((savingBalance + amount) >= 0) {
			calcSavingDeposit(amount);
			System.out.println("New Saving Account Balance:" + moneyFormat.format(savingBalance));
		} else {
			System.out.println("Balance cannot be negative." + "\n");
		}
	}

}
