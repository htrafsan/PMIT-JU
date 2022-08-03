import java.util.Scanner;

public class KeyInput {
  public static void main(String[] args) {
    String n;
    Scanner scan = new Scanner(System.in);

    int i = 1;
    while (!(n = scan.next()).equals("A")) {
      System.out.println("Input " + i + ": " + n);
      i++;
    }
  }
}
