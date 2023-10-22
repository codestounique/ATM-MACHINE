package ATM;

import java.io.IOException;

public class Main extends OptionMenu {
	public static void main(String[] args) throws IOException {
		OptionMenu optionMenu = new OptionMenu();
		System.out.println("Welcome to BovBov ATM!!!");
		optionMenu.getLogin();

	}

}
