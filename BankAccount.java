import java.util.Scanner;

public class BankAccount {
public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter account holder name: ");
    String name = scanner.nextLine();

    System.out.print("Enter initial balance: ");
    double balance = scanner.nextDouble();

    System.out.println("\n--- BANK ACCOUNT SYSTEM ---");
    System.out.println("Account Holder: " + name);
    System.out.println("Current Balance: " + balance);

    System.out.print("\nEnter amount to deposit: ");
    double deposit = scanner.nextDouble();
    balance = balance + deposit;

    System.out.println("Balance after deposit: " + balance);

    System.out.print("\nEnter amount to withdraw: ");
    double withdraw = scanner.nextDouble();

    if (withdraw <= balance) {
        balance = balance - withdraw;
        System.out.println("Withdrawal successful.");
    } else {
        System.out.println("Insufficient balance.");
    }

    System.out.println("Final Balance: " + balance);

    scanner.close();
}

}
