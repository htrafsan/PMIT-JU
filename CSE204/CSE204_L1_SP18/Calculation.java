public class Calculation {
  public static void main(String[] args) {
    int a = 10, b = 13, c = 12;
    float sum = a + b + c;
    System.out.printf("Sum: %.0f\n", sum);

    float avg = sum / 3;
    System.out.printf("Avg: %.2f\n", avg);

    if (a > b && a > c) {
      System.out.println("Max: " + a);
    }
    else if (b > a && b > c) {
      System.out.println("Max: " + b);
    }
    else {
      System.out.println("Max: " + c);
    }

    if (a < b && a < c) {
      System.out.println("Min: " + a);
    }
    else if (b < a && b < c) {
      System.out.println("Min: " + b);
    }
    else {
      System.out.println("Min: " + c);
    }
  }
}
