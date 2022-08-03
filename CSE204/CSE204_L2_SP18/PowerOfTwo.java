import java.util.Scanner;

public class PowerOfTwo {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int num = scan.nextInt();
    System.out.println(PowOfTwo(num) ? "Yes" : "No");
  }

  public static boolean PowOfTwo(int num) {
    return num != 0 && ((num & (num - 1)) == 0);
  }
}
