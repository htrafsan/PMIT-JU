import java.util.Scanner;

public class BookStore {
  Book[] books = new Book[10];

  public void sell(String bookTitle, int noOfCopies) {
    int i;
    boolean found = false;

    for (i = 0; i < books.length; i++) {
      Book b = books[i];
      
      if (b == null) {
        break;
      }
      else if (b.bookTitle.equals(bookTitle)) {
        found = true;
        if (b.numOfCopies >= noOfCopies) {
          b.numOfCopies = b.numOfCopies - noOfCopies;
          System.out.println("Successfully sold");
          break;
        }
        else {
          System.out.println("Insufficient books are available in our store.");
        }
      }
    }

    if (!found) {
      System.out.println("Book is not available.");
    }
  }

  public void order(String isbn, int noOfCopies) {
    int i;
    boolean found = false;

    for (i = 0; i < books.length; i++) {
      Book b = books[i];
      if (b == null) {
        break;
      }
      else if (b.bookISBN.equals(isbn)) {
        found = true;
        b.numOfCopies = b.numOfCopies + noOfCopies;
        System.out.println("New book added successfully.");
        break;
      }
    }

    if (!found && i < books.length) {
      Scanner scan = new Scanner(System.in);
      System.out.println("Book is not available.");
      System.out.println("To order the book please enter the 'Book Title' & 'Author Name' with ISBN: " + isbn);
      String title = scan.nextLine();
      String author = scan.nextLine();
      scan.close();
      books[i] = new Book(title, author, isbn, noOfCopies);
    }
  }

  public void display() {
    for (int i = 0; i < books.length; i++) {
      Book b = books[i];
      if (b == null) {
        break;
      }
      b.display();
    }
  }
}
