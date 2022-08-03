import java.util.Scanner;

public class UAP {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    UapCSE erm = new UapCSE();

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
        String name, id, desig;
        double sal;
        
        System.out.println("Enter the Name:");
        name = scan.next();
        
        System.out.println("Enter the ID:");
        id = scan.next();
        
        System.out.println("Enter the Designation:");
        desig = scan.next();
        
        System.out.println("Enter the Salary:");
        sal = scan.nextDouble();
        
        erm.addNewEmployee(name, id, desig, sal);
      }
      else if (n == 2) {
        String id;
        double sal;
        
        System.out.println("Enter the ID:");
        id = scan.next();
        
        System.out.println("Enter the Salary:");
        sal = scan.nextDouble();
        
        erm.getSalary(id, sal);
      }
      else if (n == 3) {
        String id;
        double amt;
        
        System.out.println("Enter the ID:");
        id = scan.next();
        
        System.out.println("Enter the Amount:");
        amt = scan.nextDouble();
        
        erm.increaseSalary(id, amt);
      }
      else if (n == 4) {
        erm.display();
      }
    }
  }
}
