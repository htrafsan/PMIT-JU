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
public class Individual {

    /**
     *
     */
    public Individual() {
        // TODO Auto-generated constructor stub
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int num;
        System.out.println("Enter A Number");
        Scanner scan = new Scanner(System.in);
        num = scan.nextInt();
        rec(num);
    }

    public static void rec(int num) {
        if (num > 0) {
            rec(num / 10);
            System.out.printf("%d ", (num % 10));
        }
    }
}