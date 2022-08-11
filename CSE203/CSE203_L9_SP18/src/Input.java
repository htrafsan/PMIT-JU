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

public class Input {
	public static void main(String[]args) throws FileNotFoundException   {
		Scanner s=new Scanner(new FileInputStream("Olympic.txt"));
		PrintStream o=new PrintStream( new FileOutputStream("Processed.txt"));
		while(s.hasNextLine()==true) {
			String a=s.nextLine();
			o.println(a);
			o.flush();
			System.out.println(a); //console print
			
		}
		 s.close();
		 o.close();
		
	}
}
