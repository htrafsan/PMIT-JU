public class UapCSE {
  Employee[] employees = new Employee[10];

  public void addNewEmployee(String n, String I, String d, double b) {
    int i;
    for (i = 0; i < employees.length; i++) {
      if (employees[i] == null) {
        employees[i] = new Employee(n, I, d, b);
        break;
      }
    }
  }

  public Employee findEmployee(String id) {
    int i;
    boolean found = false;

    for (i = 0; i < employees.length; i++) {
      if (employees[i] != null) {
        if (employees[i].id.equals(id)) {
          found = true;
          break;
        }
      }
    }

    if (found = true) {
      return employees[i];
    }
    else {
      return null;
    }
  }

  public void increaseSalary(String id, double amt) {
    Employee em = findEmployee(id);
    if (em == null) {
      System.out.println("Id doesn't exist.");
    }
    else {
      em.increaseSalary(amt);
    }
  }

  public double getSalary(String id, double newSal) {
    Employee em = findEmployee(id);
    if (em == null) {
      System.out.println("Id doesn't exist.");
    }
    else {
      em.updateSalary(newSal);
    }
    return newSal;
  }

  public void display() {
    int i;
    for (i = 0; i < employees.length; i++) {
      if (employees[i] != null) {
        employees[i].display();
      }
      else {
        break;
      }
    }
  }
}
