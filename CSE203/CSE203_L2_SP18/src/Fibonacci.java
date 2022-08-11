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
public class Fibonacci {

    /**
     *
     */
    public Fibonacci() {
        // TODO Auto-generated constructor stub
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int count, a=0, b=1;
        System.out.println("Input Total Digits ");
        Scanner scan=new Scanner(System.in);
        count=scan.nextInt();	//scan

        int i=1;
        while(i<=count) {
            System.out.print(a+" ");
            int sum=a+b;
            a=b;
            b=sum;
            i++;	//loop
        }

        System.out.print("is Fibonacci Series.");	//print
    }

}