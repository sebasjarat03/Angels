package ui;

import model.*;
import java.util.*;


public class Main {
	//atributes
	private static Scanner lectorN;
	private static Scanner lectorS;
	private static Legion legion;
	
	public static void main(String args[]) {
		Main main = new Main();
		main.printMenu();
		
		
		
		
	}
	
	//constructor
	public Main() {
		lectorN = new Scanner(System.in);
		lectorS = new Scanner(System.in);
		System.out.println("How many angels do you want?");
		int NumAngels = lectorN.nextInt();
		legion = new Legion(NumAngels);
	}
	
	//methods
	/**
	*Name: printMenu <br>
	*Description: This method prints the main menu and let you select the option that you want to execute, does not receive parameters and does not return anything.
	*/
	public void printMenu() {
		int select = 0;
		while(select!=7) {
		System.out.println("");
		System.out.println("*****************************************************************************************************");
		System.out.println("                                 MENU");
		System.out.println("");
		System.out.println("1) Register archangel           2) Count archangels                       3) Display info by name"); 
		System.out.println("4) Display info by power        5) Display celebration by month           6) Display celebrations");		  
		System.out.println("                                7) Exit");		   
		System.out.println("");
		System.out.println("*****************************************************************************************************");
		select = lectorN.nextInt();
		switch(select) {
		case 1:
			System.out.println(createArchangel());
			break;
		case 2:
			System.out.println("\nThe number of existing archangels is " + legion.countArchangels());
			break;
		case 3:
			System.out.print("\nEnter the name of the archangel: ");
			String name = lectorS.nextLine();
			System.out.println(legion.searchByName(name));
			break;
		case 4:
			System.out.print("\nEnter the power of the archangel: ");
			String power = lectorS.nextLine();
			System.out.println(legion.searchByPower(power));
			break;
		case 5:
			System.out.print("\nEnter the month in numbers: ");
			int month = lectorN.nextInt();
			System.out.println(legion.searchByMonth(month));
			break;
		case 6:
			System.out.println(legion.showAll());
			break;
		case 7:
			System.out.println("\nGoodbye!");
			break;
		default:
			System.out.println("\nInvalid option");
			break;
		}
		}
	}
	
	///////////////////////
	/**
	*Name: createArchangel<br>
	*Description: This method receives all the atributes to create the archangel<br>
	*@return returns a string from a method of the class Legion that says if the angel has been created or the errors
	*/
	public String createArchangel() {
		System.out.println("");
		System.out.print("Enter the name: "); String name = lectorS.nextLine();
		System.out.print("Enter the prayer: "); String prayer = lectorS.nextLine();
		System.out.print("Enter the day of celebration(numbers): "); int day = lectorN.nextInt();
		System.out.print("Enter month of celebration(numbers): "); int month = lectorN.nextInt();
		System.out.print("Enter the power: "); String power = lectorS.nextLine();
		System.out.print("Enter the color of candle: "); String colorcandle = lectorS.nextLine();
		System.out.print("Enter the size of candle in cm(numbers): "); double size = lectorN.nextDouble();
		System.out.print("Enter the essence of candle: "); String essence = lectorS.nextLine();
		System.out.print("Enter the light degree(numbers): "); double lightdegree = lectorN.nextDouble();
		System.out.println("");
		
		return legion.createArchangel(name, prayer, day, month, power, colorcandle, size, essence, lightdegree);
		
		}
	
}
