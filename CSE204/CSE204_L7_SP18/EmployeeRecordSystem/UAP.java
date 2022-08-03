import java.util.Scanner;

public class UAP {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    UapCSE ers = new UapCSE();

    while (true) {
      System.out.println("Input ‘1’ to add a new Employee.");
      System.out.println("Input ‘2’ to get Salary info of a specific Employee.");
      System.out.println("Input ‘3’ to increase the salary of an Employee.");
      System.out.println("Input ‘4’ to display the list of the Employees");
      System.out.println("Input ‘0’ to exit the system.");
      int n = scan.nextInt();

      if (n == 0) {
        break;
      }
      else if (n == 1) {
        System.out.println("Press ‘1’ to add a new Salaried Employee.");
        System.out.println("Press ‘2’ to add a new Hourly Employee.");
        System.out.println("Press ‘3’ to add a new Commission Employee.");
        int a = scan.nextInt();

        if (a == 1) {
          String name, id, desig;
          double sal;

          System.out.println("Enter a name:");
          name = scan.next();

          System.out.println("Enter an Id:");
          id = scan.next();

          System.out.println("Enter Designation:");
          desig = scan.next();

          System.out.println("Enter the Salary:");
          sal = scan.nextDouble();

          ers.addNewEmployee(name, id, desig, sal);
        }
        else if (a == 2) {
          String name, id, desig;
          double hourlyRate;
          int hourWorked;

          System.out.println("Enter a name:");
          name = scan.next();

          System.out.println("Enter an Id:");
          id = scan.next();

          System.out.println("Enter Designation:");
          desig = scan.next();

          System.out.println("Enter Hourly Rate:");
          hourlyRate = scan.nextDouble();

          System.out.println("Enter Hour he/she worked:");
          hourWorked = scan.nextInt();

          ers.addNewEmployee(name, id, desig, hourlyRate, hourWorked);
        }
        else if (a == 3) {
          String name, id, desig;
          double commission, sale;

          System.out.println("Enter a name:");
          name = scan.next();

          System.out.println("Enter an Id:");
          id = scan.next();

          System.out.println("Enter Designation:");
          desig = scan.next();

          System.out.println("Enter Commission:");
          commission = scan.nextDouble();

          System.out.println("Enter Sales no.:");
          sale = scan.nextDouble();

          ers.addNewEmployee(name, id, desig, commission, sale);
        }
      }
      else if (n == 2) {
        System.out.println("Enter an Id:");
        String id = scan.next();
        ers.getSalary(id);
      }
      else if (n == 3) {
        System.out.println("Enter an Id:");
        String id = scan.next();

        System.out.println("Enter the Amount:");
        double amt = scan.nextDouble();

        ers.increaseSalary(id, amt);
      }
      else if (n == 4) {
        ers.display();
      }
    }
  }
}
