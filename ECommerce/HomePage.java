package ECommerce;

import java.util.Scanner;

public class HomePage {
	Cart cart = new Cart();
	private int choice = 0;
	
	public HomePage() {
		
	}
	
	private void startMenu() {
		System.out.println("What do you want to do?");
		System.out.println("1. Purchase order");
		System.out.println("2. Manage product");
	}
	private void menu() {
		startMenu();
		choice = getUserInput();
		while(choice != 0) {
			switch(choice) {
			case 1:
			case 2:
				default :	
					break;
			}
		}
	}
	private int getUserInput() throws NumberFormatException {
		Scanner scanner = new Scanner(System.in);
		choice = scanner.nextInt();
		return choice;
	}
}
