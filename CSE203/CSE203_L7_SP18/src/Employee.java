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
	public String name;
	public String id ;
	public String designation;

	/**
	 * 
	 */
	public Employee(String name, String id, String designation) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.id = id;
		this.designation = designation;
	}
	
	public void increaseSalary(double amt){
	    	
	}
	
	public  double getSalary() {
		 return 0;
	}
	
	 public void display() {
			System.out.println("Name: ["+name+"]; Id :["+id+"]; Designation: ["+designation+"];");
	}
	 

	/**
	 * @param args
	 *
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	*/
}
