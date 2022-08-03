import java.util.Scanner;

public class Grade {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    Student std[];
    std = new Student[n];

    int i;
    for (i = 0; i < n; i++) {
      std[i] = new Student();
      std[i].attend = scan.nextFloat();
      std[i].homeWork = scan.nextFloat();
      std[i].classTest = scan.nextFloat();
      std[i].midTerm = scan.nextFloat() / 3;
      std[i].semFin = scan.nextFloat() / 3;
    }

    for (i = 0; i < n; i++) {
      std[i].total = (std[i].attend + std[i].homeWork + std[i].classTest + std[i].midTerm + std[i].semFin);
    }

    int index = 0;
    for (i = 0; i < n; i++) {
      if (std[i].total >= 80) {
        index = i + 1;
        System.out.println("Student " + index + ": A+");
      }
      else if (std[i].total >= 75 && std[i].total < 80) {
        index = i + 1;
        System.out.println("Student " + index + ": A");
      }
      else if (std[i].total >= 70 && std[i].total < 75) {
        index = i + 1;
        System.out.println("Student " + index + ": A-");
      }
      else if (std[i].total >= 65 && std[i].total < 70) {
        index = i + 1;
        System.out.println("Student " + index + ": B+");
      }
      else if (std[i].total >= 60 && std[i].total < 65) {
        index = i + 1;
        System.out.println("Student " + index + ": B");
      }
      else if (std[i].total >= 55 && std[i].total < 60) {
        index = i + 1;
        System.out.println("Student " + index + ": B-");
      }
      else if (std[i].total >= 50 && std[i].total < 55) {
        index = i + 1;
        System.out.println("Student " + index + ": C+");
      }
      else if (std[i].total >= 45 && std[i].total < 50) {
        index = i + 1;
        System.out.println("Student " + index + ": C");
      }
      else if (std[i].total >= 40 && std[i].total < 45) {
        index = i + 1;
        System.out.println("Student " + index + ": D");
      }
      else {
        index = i + 1;
        System.out.println("Student " + index + ": F");
      }
    }
  }
}

class Student {
  float attend;
  float homeWork;
  float classTest;
  float midTerm;
  float semFin;
  float total;
}
