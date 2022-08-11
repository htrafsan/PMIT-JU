/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author official_rafsan
 *
 */
public class UapCSE {
	Employee[] employees = new Employee[10];

	public void addNewEmployee(Employee e) {
		int i;
		for (i = 0; i < employees.length; i++) {
			if (employees[i] == null) {
				employees[i] = e;
				break;
			}
		}
	}

	void addNewEmployee(String n, String I, String d, double s) {
		SalariedEmployee se = new SalariedEmployee(n,I,d,s);
		this.addNewEmployee(se);
	}

	void addNewEmployee(String n, String I, String d, double hr, int hw) {
		HourlyEmployee he = new HourlyEmployee(n, I, d, hr, hw);
		this.addNewEmployee(he);
	}

	void addNewEmployee(String n, String I, String d, double p, double s) {
		CommissionEmployee ce = new CommissionEmployee(n, I, d, p, s);
		this.addNewEmployee(ce);
	}

	public Employee findEmployee(String id) {
		boolean found = false;
		int i;
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

	void increaseSalary(String id, double amt) {
		Employee em = findEmployee(id);
		if (em == null) {
			System.out.println("ID Doesn't Exist.");
		}
		else {
			em.increaseSalary(amt);
		}
	}

	double getSalary(String id) {
		Employee em = findEmployee(id);
		if (em == null) {
			System.out.println("ID Doesn't Exist");
			return 0;
		}
		else {
			return em.getSalary();
		}
	}

	public void display() {
		int i;
		for (i=0;i<employees.length;i++) {
			if (employees[i] != null) {
				employees[i].display();
			}
			else {
				break;
			}
		}
	}

	/**
	 * 
	 *
	public UapCSE() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 *
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	*/

}
