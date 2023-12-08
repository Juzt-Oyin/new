import java.util.Scanner;

public class ATM_Machine {

	public static void main(String[] args) {
		Account [] acountArr = createAccounts(10,100.0);
		
		Scanner sc = new Scanner(System.in);
		int id;
		double balance;
		
		
		while (true) {
			System.out.print("Enter an ID (0 to 9): ");
			id = sc.nextInt();
			
			if (id < 0 || id >= acountArr.length) {
				System.out.println("Invalid ID. Enter correct ID:");
			} 
			else {
				while (true) {
					System.out.println("Main menu:");
                    System.out.println("Choose an option:");
                    System.out.println("1- View current balance\n2- Withdraw money\n3- Deposit Money\n4- Exit");
			int option;
			option = sc.nextInt();
			switch (option) {
			case 1: 
				System.out.println("Current Balance is $" +acountArr[id].getBalance());
				break;
			case 2: 
				System.out.println("Enter withdrawal amount: $");
				double xx = sc.nextDouble();
                acountArr[id].withdraw(xx);
                break;
			case 3: 
				System.out.println("Enter an amount to deposit: $");
				double xxx = sc.nextDouble();
				acountArr[id].deposit(xxx);
				break;
			case 4: 
				System.out.println("Exiting");
				break;
			default:
				System.out.println("Invalid option. \nPlease enter a valid option:");

			}
			
			if (option == 4) {
			break;}
						}
				}
	}
		}
	

		public static Account[] createAccounts(int numAccounts, double initialBalance) {
        Account[] acountArr = new Account[10];
        for (int i = 0; i < 10; i++) {
            acountArr[i] = new Account(i, 100);
        }
        return acountArr;
	}
		
}