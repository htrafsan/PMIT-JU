public class Bank {
  public static void main(String[] args) {
    BankAccount BA = new BankAccount("Rafsan", "18101009", 5000);
    System.out.println("Before withdraw");
    System.out.println(BA.balance);

    BA.withdraw(500);
    System.out.println("After withdraw");
    System.out.println(BA.balance);

    System.out.println("Before deposit");
    System.out.println(BA.balance);

    BA.deposit(100);
    System.out.println("After deposit");
    System.out.println(BA.balance);
  }
}
