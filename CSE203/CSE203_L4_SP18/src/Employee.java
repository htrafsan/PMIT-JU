/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author official_rafsan
 */
public class Employee {
	public String name,id,designation;
	public double salary;
	/**
	 * 
	 */
	public Employee(String n,String s_id,String des,double sal) {
		// TODO Auto-generated constructor stub
		this.name=n;
		this.id=s_id;
		this.designation=des;
		this.salary=sal;
	}

	public void updateSalary(double newSal) {
		salary=newSal;
	}

	public double getSalary() {
		return salary;
	}

	public void display() {
		System.out.println("Name:"+name+"Id:"+id+"Designation:"+designation+"Salary:"+salary+"");
	}

	/**
	 * @param args
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	*/

}