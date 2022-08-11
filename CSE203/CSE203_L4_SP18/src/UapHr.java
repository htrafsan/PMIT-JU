/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author official_rafsan
 */
public class UapHr {

	/**
	 * 
	 
	public UapHr() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee a= new Employee("Rafsan ","18101009 ","Student ",7000);
		a.display();	//print before update
		a.updateSalary(5000);
		a.getSalary();
		a.display();	//print after update

	}
}
