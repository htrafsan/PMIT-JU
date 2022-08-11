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
public class MaxIndexMatrix {

	/**
	 * 
	 *
	public MaxIndexMatrix() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,m,i,j;
		Scanner scan = new Scanner(System.in);
		System.out.println("Declare the Size of the 2D Matrix:");
		n = scan.nextInt();
		m = scan.nextInt();
		int a [][] = new int [n][m];
		System.out.println("Enter the Values of the 2D Matrix:");
		int Max = a[0][0];
		int indexi=0,indexj=0;
		for(i=0;i<n;i++) {
			for(j=0;j<m;j++) {
					a[i][j]=scan.nextInt();
			}
		}
		for(i=0;i<n;i++) {
			for(j=0;j<m;j++) {
				if(a[i][j]>Max)	{
					Max=a[i][j];
					indexi=i;
					indexj=j;
				}	
			}
		}
		System.out.printf("Max:%d\nLocation:[%d][%d]",Max,indexi,indexj);
	}
}