/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author official_rafsan
 */
import java.util.Scanner;
public class ReachTheSquare {

	/**
	 *
	public ReachTheSquare() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		System.out.println("Enter Two Values to Run the Program:");
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		b = scan.nextInt();
		passValue(a,b);
	}
	public static void passValue(int a,int b) {
		while(a*a != b*b) {
			if(a*a > b*b){
				System.out.printf("%d ",a*a);
				a--;
			}
			else if(a*a < b*b){
				System.out.printf("%d ",a*a);
				a++;
			}	
		}
		if(a == b )
			System.out.printf("Reached");
	}
}
