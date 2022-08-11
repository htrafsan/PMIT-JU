/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author official_rafsan
 *
 */
public class Employee {
	public String name, id, designation;
	public double salary;

	/**
	 * 
	 */
	public Employee(String name, String id, String designation, double salary) {
		// TODO Auto-generated constructor stub
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
		System.out.println(" Name: " + name + "\n Id: " + id + "\n Designation: " + designation + "\n Salary: " + salary);
	}

	/**
	 * @param args
	 *
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	*/

}
