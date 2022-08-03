import java.util.Scanner;

public class BankApp {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Bank b = new Bank();
    
    String name, id;
    double bal;

    while (true) {
      System.out.println("Input ‘1’ to add a new Account.");
      System.out.println("Input ‘2’ to deposit to an existing account");
      System.out.println("Input ‘3’ to withdraw from an account.");
      System.out.println("Input ‘4’ to display the list of the accounts.");
      System.out.println("Input ‘0’ to exit the system.");

      int n = scan.nextInt();

      if (n == 0) {
        break;
      }
      else if (n == 1) {
        System.out.println("Enter name, id and balance:");
        name = scan.next();
        id = scan.next();
        bal = scan.nextDouble();
        b.addAccount(name, id, bal);
      }
      else if (n == 2) {
        System.out.println("Enter id and amount:");
        id = scan.next();
        bal = scan.nextDouble();
        b.deposit(id, bal);
      }
      else if (n == 3) {
        System.out.println("Enter id and amount:");
        id = scan.next();
        bal = scan.nextDouble();
        b.withdraw(id, bal);
      }
      else if (n == 4) {
        b.display();
      }
    }
  }
}
