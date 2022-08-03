import java.util.Scanner;

public class Digits {
  public static void main(String[] args) {
    int num;
    Scanner scan = new Scanner(System.in);
    num = scan.nextInt();
    rec(num);
  }

  public static void rec(int num) {
    if (num > 0) {
      rec(num / 10);
      System.out.printf("%d ", (num % 10));
    }
  }
}
