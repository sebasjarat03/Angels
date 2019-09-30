package model;

public class Legion {
	//atributes
	private Angel[] angel;
	
	//Constructor
	public Legion(int i) {
		angel = new Angel[i];
		
	}
	
	//methods
	public String createArchangel(String name, String prayer, int day, int month, String power, String color, double size, String essence, double lightDegree ) {
		String msg = "";
		if(nameEndsEl(name)== false) {
			msg += "The name doesn´t ends in el";
		}
		if(validName(name)== false) {
			msg += "\nThe name is already in use";
		}
		if(validPower(power)== false) {
			msg += "\nThe power is already in use";
		}
		if (msg.equalsIgnoreCase("")) {
			boolean angelinserted = false;
			for(int i = 0; i<angel.length && angelinserted == false; i++) {
				if(angel[i] == null) {
					Angel pangel = new Angel( name,  prayer, day, month, power, color, size, essence, lightDegree);
					angel[i] = pangel;
					angelinserted = true;
					msg += "\nThe angel has been inserted successfully";
				}
			}
			if (angelinserted==false) {
				msg += "\nNo more space for angels :(";
			}
			
		}
		return msg;
	}
	
	public boolean nameEndsEl(String name) {
		boolean hasEl = false;
		int lg = name.length();
		if(name.charAt(lg-2) == 'e' && name.charAt(lg-1) == 'l') {
			hasEl = true;
		}
		return hasEl;
	}
	
	public boolean validName(String name) {
		boolean is = true;
		for(int i = 0; i<angel.length && is == true  ; i++) {
			if (angel[i] !=null) {
				if (angel[i].getName().equalsIgnoreCase(name)) {
					 is = false;
				}
			}
		}
		return is;
		
	}
	
	public boolean validPower(String power) {
		boolean free = true;
		for(int i = 0; i<angel.length && free == true  ; i++) {
			if (angel[i] !=null) {
				if (angel[i].getPower().equalsIgnoreCase(power)) {
					 free = false;
				}
			}
		}
		return free;
		
	}
	
	public int countArchangels() {
		int y = 0;
		for(int i = 0; i<angel.length; i++) {
			
			if(angel[i] != null) {
				y++;
			}
		}
		return y;
	}
	
	public String searchByName(String name) {
		boolean nameFound = false;
		String msg = "\nAngel not found";
		for(int i = 0; i<angel.length && !nameFound; i++) {
			if(angel[i] != null) {
				if(angel[i].getName().equalsIgnoreCase(name)) {
					nameFound = true;
					msg = angel[i].toString();
				}
			}
		}
		return msg;
	}
	
	public String searchByPower(String power) {
		boolean powerFound = false;
		String msg = "\nPower not found";
		for(int i = 0; i<angel.length && !powerFound; i++) {
			if(angel[i] != null) {
				if(angel[i].getPower().equalsIgnoreCase(power)) {
					powerFound = true;
					msg = angel[i].toString();
				}
			}
		}
		return msg;
	}
	
	public String searchByMonth(int month) {
		
		String msg = "";
		for (int i = 0; i<angel.length; i++) {
			if(angel[i] != null) {
				if(angel[i].getMonth()==month) {
					
					msg +="\nAngel #"+ (i+1) + "\n" + angel[i].toStringMonth() + "\n";
					
				}
				
				}
			}
		if(msg.equalsIgnoreCase("")) {
			msg += "\nThis month doesn't have any angels";
		}
		return msg;
	}
	
	public String showAll() {
		String msg = "";
		for (int i = 0; i<angel.length; i++) {
			if(angel[i] != null) {
				msg += "\nAngel #" + (i+1) + ": " + angel[i].getName() + ": " + angel[i].getDay() + " of " + angel[i].monthToString() + "\n";
			}
		}
		if (msg.equalsIgnoreCase("")) {
			msg += "\nAngels not created yet";
		}
		return msg;
	}




}
