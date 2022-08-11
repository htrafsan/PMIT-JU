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
public class Pattern {

	/**
	 *
	 *
	public Pattern() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,k=1;
		int i,j;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Value for the Pattern:");
		n = scan.nextInt();
		for(i=1;i<=n;i++) {
			for(j=i;j<=2*i-1;j++) {
				System.out.printf("%d",j);
			}
			System.out.printf("\n");
		}
	}
}