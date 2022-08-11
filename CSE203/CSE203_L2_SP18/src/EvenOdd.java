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
public class EvenOdd {

    /**
     *
     */
    public EvenOdd() {
        // TODO Auto-generated constructor stub
    }

    /**
     * @param argsa
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scan = new Scanner (System.in);
        System.out. println ("Enter A Number");
        int a = scan.nextInt();
        calculate (a);
    }

    public static void calculate (int a){
        if (a%2==0)
            System.out. println ("Even");
        else
            System.out. println ("Odd");
    }

}
