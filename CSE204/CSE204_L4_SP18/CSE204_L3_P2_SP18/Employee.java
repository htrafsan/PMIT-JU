public class Employee {
  String name, id, designation;
  double salary;

  public Employee(String name, String id, String designation, double salary) {
    this.name = name;
    this.id = id;
    this.designation = designation;
    this.salary = salary;
  }

  public void updateSalary(double newSal) {
    salary = newSal;
  }

  public double getSalary() {
    return salary;
  }

  public void display() {
    System.out.printf("Name: [%s]; Id: [%s]; Designation: [%s]; Salary: [lf].\n", name, id, designation, salary);
  }
}
