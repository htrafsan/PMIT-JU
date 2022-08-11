/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author official_rafsan
 *
 */
import java.util.Scanner;
public class UAP {

	/**
	 * 
	 *
	public UAP() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		UapCSE er = new UapCSE();

		while (true) {
			System.out.println("Input '1' to add a new Employee.");
			System.out.println("Input '2' to get Salary info of a specific Employee.");
			System.out.println("Input '3' to increase the salary of an Employee.");
			System.out.println("Input '4' to display the list of the Employees");
			System.out.println("Input '0' to exit the system.");

			int n = scan.nextInt();

			if (n == 0) {
				break;
			}
			else if (n == 1) {
				String name, id, desig;
				double sal;
				
				System.out.println("Enter Name:");
				name = scan.next();
				
				System.out.println("Enter ID:");
				id = scan.next();
				
				System.out.println("Enter Designation:");
				desig = scan.next();
				
				System.out.println("Enter Salary:");
				sal = scan.nextDouble();
				
				er.addNewEmployee(name, id, desig, sal);
			}
			else if (n == 2) {
				String id;
				double sal;
				
				System.out.println("Enter ID:");
				id = scan.next();
				
				System.out.println("Enter Salary:");
				sal = scan.nextDouble();
				
				er.getSalary(id, sal);
			}
			else if (n == 3) {
				String id;
				double amt;
				
				System.out.println("Enter ID:");
				id = scan.next();
				
				System.out.println("Enter Amount:");
				amt = scan.nextDouble();
				
				er.increaseSalary(id, amt);
			}
			else if (n == 4) {
				er.display();
			}
		}

	}

}
