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
public class ReverseArray {

	/**
	 * 
	 */
	public ReverseArray() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[5]; 
	 	System.out.println("Enter the elements of the array upto 5:");
	 	
	 	for(int i=0; i<5; i++) {
	 		arr[i]=scan.nextInt();
	}
	 	for(int j=arr.length-1; j>=0; j-- ) {
	 		System.out.printf("%d ",arr[j]);
	 	}
	}
}