public class HourlyEmployee extends Employee {
  double hourlyRate;
  int hourWorked;

  public HourlyEmployee(String name, String id, String designation, double hourlyRate, int hourWorked) {
    super(name, id, designation);
    this.hourlyRate = hourlyRate;
    this.hourWorked = hourWorked;
  }

  public void increaseSalary(double amt) {
    hourlyRate += amt;
  }

  public double getSalary() {
    return (hourWorked * hourlyRate);
  }

  public void display() {
    super.display();
    System.out.println("Rate: " + hourlyRate);
  }
}
