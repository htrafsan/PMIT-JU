public class Book {
  public String bookTitle;
  public String bookAuthor;
  public String bookISBN;
  public int numOfCopies;

  public Book(String bookTitle, String bookAuthor, String bookISBN, int numOfCopies) {
    this.bookTitle = bookTitle;
    this.bookAuthor = bookAuthor;
    this.bookISBN = bookISBN;
    this.numOfCopies = numOfCopies;
  }

  public void display() {
    System.out.println(" Title: " + bookTitle);
    System.out.println("Author: " + bookAuthor);
    System.out.println("ISBN: " + bookISBN);
    System.out.println("Quantity: " + numOfCopies);
  }
}
