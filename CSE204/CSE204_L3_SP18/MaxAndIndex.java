import java.util.Scanner;

public class MaxAndIndex {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    int b = scan.nextInt();
    int[][] arr = new int[a][b];

    for (int i = 0; i < a; i++) {
      for (int j = 0; j < b; j++) {
        arr[i][j] = scan.nextInt();
      }
    }
    Matrix(arr);
  }

  public static void Matrix(int[][] arr) {
    int i, j;
    int max = arr[0][0];
    int index1 = 0, index2 = 0;

    for (i = 0; i < arr.length; i++) {
      for (j = 0; j < arr.length; j++) {
        if (arr[i][j] > max) {
          max = arr[i][j];
          index1 = i;
          index2 = j;
        }
      }
    }
    
    System.out.println("Max: " + max);
    System.out.println("Location: [" + index1 + "][" + index2 + "]");
  }
}
