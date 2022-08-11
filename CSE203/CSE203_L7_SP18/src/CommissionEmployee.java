/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author official_rafsan
 *
 */
public class CommissionEmployee extends Employee {
	public double  commission;
    public double sale;

	/**
	 * 
	 */
	public CommissionEmployee(String name, String id, String designation,double commission,double sale) {
		// TODO Auto-generated constructor stub
		super(name,id,designation);
   		this.commission= commission;
   		this.sale=sale;
	}
	
	@Override
	public void increaseSalary(double amt) {
		commission=commission+amt;
		
	}

	@Override
	public double getSalary() {
		return commission * sale;
	}

	@Override
	public void display() {
		super.display();
		System.out.println("Commission: "+commission);
	}
	
	

	/**
	 * @param args
	 *
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	*/

}
