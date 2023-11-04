import java.util.Scanner;

public class ATMInterface {
    private static double accountBalance = 1000.0; 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        System.out.println("Welcome to the ATM!");

        while (isRunning) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Deposit Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    withdrawMoney();
                    break;
                case 3:
                    depositMoney();
                    break;
                case 4:
                    isRunning = false;
                    System.out.println("Thank you for using the ATM. Have a great day!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }

    public static void checkBalance() {
        System.out.println("Your account balance is: $" + accountBalance);
    }

    public static void withdrawMoney() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount to withdraw: $");
        double amount = scanner.nextDouble();

        if (amount > accountBalance) {
            System.out.println("Insufficient funds. Please try a smaller amount.");
        } else {
            accountBalance -= amount;
            System.out.println("You have successfully withdrawn $" + amount);
        }
    }

    public static void depositMoney() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount to deposit: $");
        double amount = scanner.nextDouble();

        if (amount <= 0) {
            System.out.println("Invalid amount. Please enter a positive amount to deposit.");
        } else {
            accountBalance += amount;
            System.out.println("You have successfully deposited $" + amount);
        }
    }
}
