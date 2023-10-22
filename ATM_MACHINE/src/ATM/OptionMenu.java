package ATM;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OptionMenu extends Account {
	int x = 1;
	int selection;
	int userName, pinNumber;
	Scanner menuInput = new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
	Map<Integer, Integer> data = new HashMap<Integer, Integer>();

	/* Validate customer number and pin */
	/**
	 * @throws IOException
	 */
	public void getLogin() throws IOException {
		do {
			try {
				data.put(767609758, 5643);
				data.put(934455848, 6329);
				data.put(111111111, 5555);
				data.put(222222222, 6666);
				data.put(333333333, 7777);

				System.out.println("Enter Your Account Number:");
				userName = menuInput.nextInt();
				System.out.println("Enter The Pin Number:");
				pinNumber = menuInput.nextInt();

			} catch (Exception e) {
				System.out.println("\nInvalid Characters.only number \n");
				System.out.println("\n Run again enter valid inputs \n");
				x = 2;
			}

			if (data.containsKey(userName) && data.get(userName).equals(pinNumber)) {
				getAccountType();
				x = 2;
				System.out.println("Thank you for using ABC ATM,Visit Again!");
			} else {

				System.out.println("Invlid credentials!");
			}

		} while (x == 1);

	}

	/* Display Selection menu */
	public void getAccountType() {
		System.out.println(".......... Select Account Type ..........");
		System.out.println("Type 1-Checking Account");
		System.out.println("Type 2-Savings Account");
		System.out.println("Type 3- Exit");
		System.out.println("Enter Your Choice:");
		selection = menuInput.nextInt();
		switch (selection) {
		case 1:
			getChecking();
			break;
		case 2:
			getSavings();
			break;
		case 3:
			menuInput.close();
			break;
		default:
			System.out.println("\nInvalid Choice.\n");
			getAccountType();
		}
	}

	/* Display the checking account selection */
	public void getChecking() {
		System.out.println(".......... Checking account ..........");
		System.out.println("Type 1-View Balance");
		System.out.println("Type 2-Withdraw Funds");
		System.out.println("Type 3-Deposit Funds:");
		System.out.println("Type 4- Exit");
		System.out.println("Enter Your Choice:");
		selection = menuInput.nextInt();
		switch (selection) {
		case 1:
			System.out.println("Checking Account Balance:" + moneyFormat.format(getCheckingBalance()));
			getAccountType();
			break;
		case 2:
			getCheckingWithdrawInput();
			getAccountType();
			break;
		case 3:
			getCheckingDepositInput();
			getAccountType();
			break;
		case 4:
			getAccountType();
			break;
		default:
			System.out.println("\nInvalid Choice.\n");
			getChecking();
		}
	}

	/* Display savings account selection */
	public void getSavings() {
		System.out.println(".......... Savings account ..........");
		System.out.println("Type 1-View Balance");
		System.out.println("Type 2-Withdraw Funds");
		System.out.println("Type 3-Deposit Funds:");
		System.out.println("Type 4- Exit");
		System.out.println("Enter Your Choice:");
		selection = menuInput.nextInt();
		switch (selection) {
		case 1:
			System.out.println("Sviking Account Balance:" + moneyFormat.format(getSavingBalance()));
			getAccountType();
			break;
		case 2:
			getSavingWithdrawInput();
			getAccountType();
			break;
		case 3:
			getSavingDepositInput();
			getAccountType();
			break;
		case 4:
			getAccountType();
			break;
		default:
			System.out.println("\nInvalid Choice\n");
			getSavings();
			break;
		}
	}

}
