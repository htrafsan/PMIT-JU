/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author official_rafsan
 *
 */
public class HourlyEmployee extends Employee {
	public double  hourlyRate;
    public double hourWorked;

	/**
	 * 
	 */
	public HourlyEmployee(String name, String id, String designation,double hourlyRate,double hourWorked) {
		// TODO Auto-generated constructor stub
		super(name,id,designation);
  		this.hourlyRate= hourlyRate;
  		this.hourWorked=hourWorked;
	}
	
	@Override
	public void increaseSalary(double amt) {
		hourlyRate=hourlyRate+amt;
	}

	@Override
	public double getSalary() {
		return hourWorked*hourlyRate;
	}

	@Override
	public void display() {
		super.display();
		System.out.println("Rate: "+hourlyRate);
	}
	
	

	/**
	 * @param args
	 *
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	*/


}
