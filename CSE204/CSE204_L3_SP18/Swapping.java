import java.util.Scanner;

public class Swapping {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    int b = scan.nextInt();
    Swap(a, b);
    System.out.println("Value in main: " + a + " " + b);
  }

  public static void Swap(int a, int b) {
    int temp;
    temp = a;
    a = b;
    b = temp;
    System.out.println("Value in method: " + a + " " + b);
  }
}
