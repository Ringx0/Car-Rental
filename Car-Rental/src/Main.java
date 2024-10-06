import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		while (true) {
			System.out.println("\nWelcome to Pawel's Car Rental");
			System.out.println("1. Login In");
			System.out.println("2. Create an Account");
			System.out.println("3. Exit");
			System.out.print("Choose an option: ");
			int option = sc.nextInt();
			sc.nextLine(); // Consume newline because otherwise it nextLine() was inputed

			switch (option) {
			case 1:
				userLogin();
				break;
			case 2:
				// create account function
				break;
			case 3:
				System.out.println("Exiting...");
				return;
			default:
				System.out.println("Invalid choice. Please try again.");
			}
		}
	}

	public static void userLogin() {
		System.out.println("Please enter username:");
		String username = sc.nextLine();
		System.out.println("Please enter password:");
		String password = sc.nextLine();
		if (username.equals("admin") && password.equals("admin")) {
			userMenu(username);
		} else
			System.out.println("Incorrect credentials");
	}

	public static void userMenu(String username) {
		while (true) {
			System.out.println("\nUser Menu for " + username + ":");
			System.out.println("1. View Available Cars");
			System.out.println("2. Rent a Car");
			System.out.println("3. Return a Car");
			System.out.println("4. Logout");
			System.out.print("Choose an option: ");
			int option = sc.nextInt();
			sc.nextLine();

			switch (option) {
			case 1:
				System.out.println("\n1. Audi A3 2021\n2. BMW 3 Series 2023\n3. Mercedes S Class 2024");
				break;
			case 2:
				// rent a car function
				break;
			case 3:
				// return a car function
				break;
			case 4:
				return; // Logging out
			default:
				System.out.println("Invalid choice. Please try again.");
			}
		}
	}

}
