import java.util.Scanner;

public class EvenSum {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int[] arr = new int[n];

    int i;
    for (i = 0; i < n; i++) {
      arr[i] = scan.nextInt();
    }
    Sum(arr);
  }

  public static void Sum(int[] arr) {
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] % 2 == 0) {
        sum = sum + arr[i];
      }
    }
    System.out.println(sum);
  }
}
