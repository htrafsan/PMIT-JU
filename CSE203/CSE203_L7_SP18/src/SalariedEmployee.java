/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author official_rafsan
 *
 */
public class SalariedEmployee extends Employee {
	public double  monthlySalary;
	/**
	 * 
	 */
	public SalariedEmployee(String name, String id, String designation,double monthlySalary) {
		// TODO Auto-generated constructor stub
		super(name,id,designation);
		this.monthlySalary=monthlySalary;
	}
	
	@Override
	public void increaseSalary(double amt) {
		monthlySalary=monthlySalary+amt;
	}
	
	@Override
	public double getSalary() {
		return monthlySalary ;
	}

	@Override
	public void display() {
		super.display();
		System.out.println("Salary:"+monthlySalary);
	}

	/**
	 * @param args
	 *
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	*/

}
