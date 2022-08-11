/**
 * 
 */

/**
 * @author Lab4PC17
 *
 */
import java.io.*;
public class Serialize {

	/**
	 * 
	 */
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Employee e1= new Employee("rafsan", "18101009", 10000);
			FileOutputStream fout = new FileOutputStream ("e.txt");
			ObjectOutputStream out = new ObjectOutputStream (fout);
			
			out.writeObject(e1);
			out.flush();
			System.out.println("Success");
			
			out.close();
			
		}
		catch (Exception a)
		{
			System.out.println(a.getMessage());
		}
		

	}

}
