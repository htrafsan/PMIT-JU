public class SalariedEmployee extends Employee {
  double monthlySalary;

  public SalariedEmployee(String name, String id, String designation, double monthlySalary) {
    super(name, id, designation);
    this.monthlySalary = monthlySalary;
  }

  public void increaseSalary(double amt) {
    monthlySalary += amt;
  }

  public double getSalary() {
    return monthlySalary;
  }

  public void display() {
    super.display();
    System.out.println("Salary: " + monthlySalary);
  }
}
