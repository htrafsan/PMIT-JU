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
		UapCSE e = new UapCSE();

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
				System.out.println("Press '1' to add a new Salaried Employee.");
				System.out.println("Press '2' to add a new Hourly Employee.");
				System.out.println("Press '3' to add a new Commission Employee.");

				int a = scan.nextInt();
				
				if (a == 1) {
					String name, id, des;
					double sal;

					System.out.println("Enter Name:");
					name= scan.next();

					System.out.println("Enter ID:");
					id= scan.next();

					System.out.println("Enter Designation:");
					des= scan.next();

					System.out.println("Enter Salary:");
					sal= scan.nextDouble();

					e.addNewEmployee(name,id,des,sal);
				}
				
				else if (a== 2) {
					String name, id, des;
					double hourlyRate;
					int hourWorked;

					System.out.println("Enter Name:");
					name= scan.next();

					System.out.println("Enter ID:");
					id= scan.next();

					System.out.println("Enter Designation:");
					des= scan.next();

					System.out.println("Enter Hourly Rate:");
					hourlyRate= scan.nextDouble();

					System.out.println("Enter Total Time:");
					hourWorked= scan.nextInt();

					e.addNewEmployee(name,id,des,hourlyRate,hourWorked);
				}
				
				else if (a == 3) {
					String name,id,des;
					double commission, sale;

					System.out.println("Enter Name:");
					name= scan.next();

					System.out.println("Enter ID:");
					id= scan.next();

					System.out.println("Enter Designation:");
					des = scan.next();

					System.out.println("Enter Commission:");
					commission= scan.nextDouble();

					System.out.println("Enter Sales Number:");
					sale= scan.nextDouble();

					e.addNewEmployee(name,id,des,commission,sale);
				}
			}
			
			
			else if (n == 2) {
				System.out.println("Enter ID:");
				String id = scan.next();
				e.getSalary(id);
			}
			
			else if (n == 3) {
				System.out.println("Enter ID:");
				String id = scan.next();

				System.out.println("Enter Amount:");
				double amt = scan.nextDouble();

				e.increaseSalary(id, amt);
			}
			
			else if (n == 4) {
				e.display();
			}
		}
		
	}

}
