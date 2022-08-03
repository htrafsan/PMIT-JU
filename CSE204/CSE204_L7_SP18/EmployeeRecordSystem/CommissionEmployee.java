public class CommissionEmployee extends Employee {
  double commission;
  double sale;

  public CommissionEmployee(String name, String id, String designation, double comission, double sale) {
    super(name, id, designation);
    this.commission = comission;
    this.sale = sale;
  }

  public void increaseSalary(double amt) {
    commission += amt;
  }

  public double getSalary() {
    return (commission * sale);
  }

  public void display() {
    super.display();
    System.out.println("Commission: " + commission);
  }
}
