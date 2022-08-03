public class Employee {
  public String name;
  public String id;
  public String designation;

  public Employee(String name, String id, String designation) {
    super();
    this.name = name;
    this.id = id;
    this.designation = designation;
  }

  public void increaseSalary(double amt) {
    // Leave it empty.
  }

  public double getSalary() {
    return 0;
  }

  public void display() {
    System.out.println(" Name: " + name + "\n Id: " + id + "\n Desig: " + designation);
  }
}
