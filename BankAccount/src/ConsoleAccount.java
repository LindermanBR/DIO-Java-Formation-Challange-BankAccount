import java.util.Scanner;

public class ConsoleAccount {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int accountNumber;
        String accountAgency;
        String customerName;
        double accountBalance;

        System.out.println("Welcome to the bank!");
        System.out.print("Type the account number: ");
        accountNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Type the account agency: ");
        accountAgency = scanner.nextLine();
        System.out.print("Type the customer name: ");
        customerName = scanner.nextLine();
        System.out.print("Type the account balance: ");
        accountBalance = scanner.nextDouble();

        System.out.printf(
                "Hello %s, thank you for creating an account with our bank. Your agency is %s, account %d, and your balance %.2f is already available for withdrawal.%n",
                customerName, accountAgency, accountNumber, accountBalance);
        scanner.close();
    }
}
