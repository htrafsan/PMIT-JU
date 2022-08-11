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
public class SumArray {

	/**
	 * 
	 */
	public SumArray() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, sum=0, i;
		Scanner scan = new Scanner (System.in);
		System.out. println ("Enter The Total Number of Elements");
		n=scan.nextInt();
		int a[]= new int [n];
		System.out. println ("Enter The Elements of The Array ");
		for(i=0;i<n;i++)
				a[i]= scan.nextInt();
		for(i=0;i<n;i++) {				
			if(a[i]%2==0)
				sum = sum + a[i];
		}
		System.out. printf ("sum is %d\n",sum);
	}

}
