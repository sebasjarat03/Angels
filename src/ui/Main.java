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
		main.PrintMenu();
		
		
		
		
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
	public void PrintMenu() {
		int select = 0;
		while(select!=8) {
		System.out.println("");
		System.out.println("1) Register archangel           2) Count archangels                       3) Display info by name"); 
		System.out.println("4) Display info by power        5) Display celebration by month           6) Display celebrations");		  
		System.out.println("7) unavailable                  8) Exit");		   
		select = lectorN.nextInt();
		switch(select) {
		case 1:
			System.out.println(CreateArchangel());
			break;
		case 2:
			System.out.println("The number of existing archangels is " + legion.CountArchangels());
			break;
		case 3:
			System.out.println("Enter the name of the archangel");
			String name = lectorS.nextLine();
			System.out.println(legion.SearchByName(name));
			break;
		case 4:
			System.out.println("Enter the power of the archangel");
			String power = lectorS.nextLine();
			System.out.println(legion.SearchByPower(power));
			break;
		}
		}
	}
	
	///////////////////////
	public String CreateArchangel() {
		System.out.println("");
		System.out.print("Enter the name: "); String name = lectorS.nextLine();
		System.out.print("Enter the prayer: "); String prayer = lectorS.nextLine();
		System.out.print("Enter the date of celebration (day/month): "); String dateceleb = lectorS.nextLine();
		System.out.print("Enter the power: "); String power = lectorS.nextLine();
		System.out.print("Enter the color of candle: "); String colorcandle = lectorS.nextLine();
		System.out.print("Enter the size of candle: "); double size = lectorN.nextDouble();
		System.out.print("Enter the essence of candle: "); String essence = lectorS.nextLine();
		System.out.print("Enter the light degree: "); double lightdegree = lectorN.nextDouble();
		System.out.println("");
		
		return legion.CreateArchangel(name, prayer, dateceleb, power, colorcandle, size, essence, lightdegree);
		
		}
	
}
