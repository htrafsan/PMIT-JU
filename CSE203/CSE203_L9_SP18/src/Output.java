/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author official_rafsan
 */
import java.io.*;
import java.util.Scanner;

public class Output {
	public static void main(String[]args) throws FileNotFoundException   {
		Scanner s=new Scanner(new FileInputStream("Olympic.txt"));
		PrintStream o=new PrintStream( new FileOutputStream("Output.txt"));
		while(s.hasNextLine()==true) {
			String a=s.nextLine();
			String[] w=a.split(" ");
			int sum=Integer.parseInt(w[1])+Integer.parseInt(w[2])+Integer.parseInt(w[3]);
			
			o.println("Team: "+a+"     Medals: "+sum);
			o.flush();
			
			
		}
		
		 s.close();
		 o.close();
		
	}

}