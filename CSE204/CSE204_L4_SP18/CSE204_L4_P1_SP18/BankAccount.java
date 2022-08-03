public class BankAccount {
  String name;
  String id;
  double balance;

  public BankAccount(String name, String id, double balance) {
    this.name = name;
    this.id = id;
    this.balance = balance;
  }

  public void deposit(double depAmount) {
    balance += depAmount;
  }

  public void withdraw(double withAmount) {
    if (balance < withAmount) {
      System.out.println("Insufficient Balance");
    }
    else {
      balance -= withAmount;
    }
  }

  public double getBalance() {
    return balance;
  }

  public void display() {
    System.out.printf("Name: [%s]; Id: [%s]; Balance: [lf].\n", name, id, balance);
  }
}
