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
public class SwapInMethod {

	/**
	 * 

	public SwapInMethod() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Two Nubers to Swap in Method:");
		int a1,b1;
		Scanner scan = new Scanner(System.in);
		a1 = scan.nextInt();
		b1 = scan.nextInt();
		passValue(a1,b1);
		System.out.printf("Value in Main: %d %d\n",a1,b1);
	}
	public static void passValue(int a,int b) {
		int temp;
		temp = a;
		a = b;
		b = temp;
		System.out.printf("Value in Method: %d %d\n",a,b);
	}
}