public class Bank {
  BankAccount[] accounts = new BankAccount[10];

  public void addAccount(String name, String id, double balance) {
    int i;
    for (i = 0; i < 10; i++) {
      if (accounts[i] == null) {
        accounts[i] = new BankAccount(name, id, balance);
        break;
      }
    }
  }

  public BankAccount findAccount(String id) {
    int i;
    boolean found = false;

    for (i = 0; i < 10; i++) {
      if (accounts[i].id.equals(id)) {
        found = true;
        break;
      }
    }
    
    if (found = true) {
      return accounts[i];
    }
    else {
      return null;
    }
  }

  public void deposit(String id, double amt) {
    BankAccount ba = findAccount(id);
    if (ba == null) {
      System.out.println("Id is not found.");
    }
    else {
      ba.deposit(amt);
    }
  }

  public void withdraw(String id, double amt) {
    BankAccount ba = findAccount(id);
    if (ba == null) {
      System.out.println("Id is not found.");
    }
    else {
      ba.withdraw(amt);
    }
  }

  public void display() {
    int i;
    for (i = 0; i < 10; i++) {
      if (accounts[i] != null) {
        accounts[i].display();
      }
      else {
        break;
      }
    }
  }
}
