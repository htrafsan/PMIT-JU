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
public class PrimeNumber {

	/**
	 * 
	 */
	public PrimeNumber() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		 System.out.println("Enter A Number");
		 int a = scan.nextInt();
		 calculate(a);	//scan

	}
	
	public static void calculate(int a){

		//loop check 
	    if (a<=1) {	        
		System.out.println("Not A Prime Number");
	        System.exit(1);
	    }
   
	    int fl=0;
	    for (int j=2; j<=a/2; j++) {
	        if ((a%j)==0){
	            fl = 1;
	            break;
	        }
	    }

	    //print
	    if (fl==0)
	         System.out.println("Prime Number");
	     else
	         System.out.println("Not A Prime Number");
	}

}