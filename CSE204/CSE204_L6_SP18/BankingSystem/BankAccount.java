public class BankAccount {
  String name, id;
  double balance;

  public BankAccount(String name, String id, double balance) {
    this.name = name;
    this.id = id;
    this.balance = balance;
  }

  void deposit(double depAmount) {
    balance += depAmount;
  }

  void withdraw(double withAmount) {
    balance -= withAmount;
    if (balance < 0) {
      balance = 0;
    }
  }

  double getBalance() {
    return balance;
  }

  void display() {
    System.out.println("Name: " + name);
    System.out.println("Id: " + id);
    System.out.println("Balance: " + balance);
  }
}
