import java.util.Scanner;

public class MaxMinIndex {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int[] arr = new int[n];

    int i;
    for (i = 0; i < n; i++) {
      arr[i] = scan.nextInt();
    }
    Determine(arr);
  }

  public static void Determine(int[] arr) {
    int i, index = 0;
    int max = arr[0];

    for (i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
        index = i;
      }
    }
    System.out.printf("Max: %d, Index: %d\n", max, index);

    int min = arr[0];
    for (i = 0; i < arr.length; i++) {
      if (arr[i] < min) {
        min = arr[i];
        index = i;
      }
    }  
    System.out.printf("Min: %d, Index: %d\n", min, index);
  }
}
