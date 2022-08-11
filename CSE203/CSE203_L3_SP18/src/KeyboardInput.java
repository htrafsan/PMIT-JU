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
public class KeyboardInput {

	/**
	 * 
	 *
	public KeyboardInput() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Anything:");
		int x=1;
		while(!(a = scan.next()).equals("A")){
			System.out.printf("Input %d: %s\n",x,a);
			x++;
		}
	}
}