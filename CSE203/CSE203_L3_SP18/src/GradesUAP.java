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
public class GradesUAP {

    /**
     *
     *
    public GradesUAP() {
        // TODO Auto-generated constructor stub
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int n,i;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number of Students:");
        n = scan.nextInt();
        for(i=1;i<=n;i++){
            double Att=0,Ass=0,CT=0,Mid=0,Final=0,Sum=0;
            System.out.println("Enter Marks:");
            Att = scan.nextDouble();
            Ass = scan.nextDouble();
            CT = scan.nextDouble();
            Mid = scan.nextDouble();
            Final = scan.nextDouble();
            Sum = Att + Ass + CT + Mid/3 + Final/3;
            if(Sum>=80)
                System.out.println("Student "+i+" :A+");
            else if(Sum>=75)
                System.out.println("Student "+i+" :A");
            else if(Sum>=70)
                System.out.println("Student "+i+" :A-");
            else if(Sum>=65)
                System.out.println("Student "+i+" :B+");
            else if(Sum>=60)
                System.out.println("Student "+i+" :B");
            else if(Sum>=55)
                System.out.println("Student "+i+" :B-");
            else if(Sum>=50)
                System.out.println("Student "+i+" :C+");
            else if(Sum>=45)
                System.out.println("Student "+i+" :C");
            else if(Sum>=40)
                System.out.println("Student "+i+" :D");
            else
                System.out.println("Student "+i+" :F");
        }
    }
}