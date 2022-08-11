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
public class PoTwo {

	/**
	 * 
	 */
	public PoTwo() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a Number");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.println(PowOfTwo(num) ? "Yes" : "No");

	}
	public static boolean PowOfTwo(int num) {
		return num != 0 && ((num & (num - 1)) == 0);
	}

}
