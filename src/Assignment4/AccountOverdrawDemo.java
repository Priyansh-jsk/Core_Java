package Assignment4;

import java.util.Scanner;

public class AccountOverdrawDemo extends Thread {
	Account account = new Account(1000.00);

	public void run() {
		account.withdraw(1000);
	}
}

class Main {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		
		AccountOverdrawDemo AC = new AccountOverdrawDemo();
		Thread t1 = new Thread(AC, "Priyansh ");
		Thread t2 = new Thread(AC, "Neema");
		
		SynchronizeDemo AC1 = new SynchronizeDemo();
		Thread user1 = new Thread(AC1, "Ram");
		Thread user2 = new Thread(AC1, "Shri");

		while (true) {
			System.out.println("1. Thread safety: ");
            System.out.println("2. Thread Unsafefy: ");
			System.out.println("3. Exit !");
			System.out.println("Enter your choice from above 2 methods: ");
			int choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				t1.start();
				t2.start();
				break;
			case 2:
				user1.start();
				user2.start();
				break;
			case 3:
				System.exit(0);
				break;
			default:
				System.out.println("Enter Again!!");
				break;

			}

		}

	}
}
