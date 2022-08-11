/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author official_rafsan
 *
 */
public class SumMaxMin {

    /**
     *
     */
    public SumMaxMin() {
        // TODO Auto-generated constructor stub
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int a=3,b=7,c=4;
        float sum = a+b+c;
        float avg =sum/3;
        System.out.println(sum);
        System.out.printf("%f\n",avg);
        if(a<b && b<c)
            System.out.printf("Maximum: %d\n",c);
        else if (a<b && b>c)
            System.out.printf("Maximum: %d\n",b);
        else
            System.out.printf("Maximum: %d\n",a);
        if(a<b && b<c)
            System.out.printf("Minimum: %d\n",c);
        else if (a>b && b<c)
            System.out.printf("Minimum: %d\n",b);
        else
            System.out.printf("Minimum: %d\n",a);

    }

}