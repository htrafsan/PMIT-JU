public class Employee {
  public String name;
  public String id;
  public String designation;
  public double salary;

  public Employee(String name, String id, String designation, double salary) {
    this.name = name;
    this.id = id;
    this.designation = designation;
    this.salary = salary;
  }

  public void increaseSalary(double amt) {
    salary = salary + amt;
  }

  public double getSalary() {
    return salary;
  }

  public void updateSalary(double newSal) {
    salary = newSal;
  }

  public void display() {
    System.out.println(" Name: " + name + "\n Id: " + id + "\n Desig: " + designation + "\n Salary: " + salary);
  }
}
