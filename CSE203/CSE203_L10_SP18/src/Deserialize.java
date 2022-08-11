/**
 * 
 */

/**
 * @author Lab4PC17
 *
 */
import java.io.*;
public class Deserialize {

	/**
	 * 
	 */
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			
			ObjectInputStream e= new ObjectInputStream (new FileInputStream ("e.txt"));
			Employee e1 = (Employee) e.readObject();
			System.out.println(e1.id+" "+e1.name);
			e.close();			
			
		}
		catch(Exception a) {
			System.out.println(a.getMessage());
		}

	}

}
