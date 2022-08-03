import java.util.Scanner;

public class PrimeNumber {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int num = scan.nextInt();
    PrimeOrNot(num);
  }

  public static void PrimeOrNot(int n) {
    int i, flag = 0;
    for (i = 2; i <= n / 2; ++i) {
      if (n % i == 0) {
        flag = 1;
        break;
      }
    }

    if (flag == 0) {
      System.out.println("Prime");
    }
    else {
      System.out.println("Not Prime");
    }
  }
}
