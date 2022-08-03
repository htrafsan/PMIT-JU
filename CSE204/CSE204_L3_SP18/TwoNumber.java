import java.util.Scanner;

public class TwoNumber {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int X = scan.nextInt();
    int Y = scan.nextInt();
    TwoNum(X, Y);
  }

  public static void TwoNum(int x, int y) {
    int i, temp;
    if (x > y) {
      for (i = 0; i < y; i++) {
        temp = x * x;
        System.out.print(temp + ", ");
        x--;
      }
      System.out.println("Reached!");
    }
    else if (x < y) {
      for (i = x; i < y; i++) {
        temp = x * x;
        System.out.print(temp + ", ");
        x++;
      }
      System.out.println("Reached!");
    }
    else {
      System.out.println("Reached!");
    }
  }
}
