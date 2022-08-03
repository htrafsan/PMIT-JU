import java.util.Scanner;

public class Pattern {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    Pat(n);
  }

  public static void Pat(int n) {
    int i, j, k;
    for (i = 1; i <= n; i++) {
      j = i;
      for (k = 1; k < i; k++) {
        System.out.printf("%d", j++);
      }
      System.out.println();
    }
  }
}
