import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class TestEmployee {
	static Scanner scan = new Scanner(System.in);
	static String fileName = "employee.txt";
	
	

	public static void main(String[] args) {
		
		UapCse uap = null;
		ObjectInputStream ois = null;
		try {	
			ois = new ObjectInputStream (new FileInputStream (fileName));
			uap= (UapCse)ois.readObject();	
		}
		catch(IOException | ClassNotFoundException e) {
			uap= new UapCse();
			System.out.println("No Data Found");
		}
		
		
		finally {
			try {
				ois.close(); //close file
				
			}
			catch (Exception o) {
				System.out.println(o); //null pointer exception
			}
		}
		
		
	//	UapCse bank = new UapCse();
			while(true) {
			int option = showMenu();
			switch(option) {
			case 1: 
				System.out.println("enter name, id , balance");
				uap.addEmployee(scan.next(), scan.next(), scan.nextDouble());
				break;
			case 2:
				System.out.println("enter id , amount to increase");
				uap.increaseSalary(scan.next(), scan.nextDouble());
				break;
			case 3:
				uap.display();
				break;
			case 0:
				
				//data save
				ObjectOutputStream os = null;
				try {
					os= new ObjectOutputStream (new FileOutputStream (fileName));
					os.writeObject(uap);
					System.out.println("Saving");
				}
				
				catch(IOException a) {
					System.out.println("No Data Found");
				}
				catch(Exception b) {
					
				}	
				
				System.exit(0);
			}
		
		}

	}
	
	static int showMenu() {
		System.out.println("Enter 1 to create, 2 to increase, 3 to display, 0 to exit");
		return scan.nextInt();
	}

}
