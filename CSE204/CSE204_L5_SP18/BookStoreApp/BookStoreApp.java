import java.util.Scanner;

public class BookStoreApp {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    BookStore bs = new BookStore();

    while (true) {
      System.out.println("Press '1' to display all the books.");
      System.out.println("Press '2' to order new books.");
      System.out.println("Press '3' to sell books.");
      System.out.println("Press '0' to exit the system.");

      String Isbn, bTitle;
      int Copies;
      int n = scan.nextInt();

      if (n == 0) {
        break;
      }
      else if (n == 1) {
        bs.display();
      }
      else if (n == 2) {
        System.out.println("Enter the book ISBN:");
        Isbn = scan.next();
        System.out.println("Enter the copies number:");
        Copies = scan.nextInt();
        bs.order(Isbn, Copies);
      }
      else if (n == 3) {
        System.out.println("Enter the book title:");
        bTitle = scan.next();
        System.out.println("Enter the copies number:");
        Copies = scan.nextInt();
        bs.sell(bTitle, Copies);
      }
    }
  }
}
