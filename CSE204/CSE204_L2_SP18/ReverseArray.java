import java.util.Scanner;

public class ReverseArray {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int[] arr = new int[n];

    int i;
    for (i = 0; i < n; i++) {
      arr[i] = scan.nextInt();
    }
    Reverse(arr);
  }

  public static void Reverse(int[] a) {
    int len = a.length;
    int[] b = new int[len];
    int i, k, j = len;

    for (i = 0; i < len; i++) {
      b[j - 1] = a[i];
      j = j - 1;
    }

    for (k = 0; k < len; k++) {
      System.out.printf("%d ", b[k]);
    }
  }
}
