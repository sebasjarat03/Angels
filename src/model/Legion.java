package model;

public class Legion {
	//atributes
	private Angel[] angel;
	
	//Constructor
	public Legion(int i) {
		angel = new Angel[i];
		
	}
	
	//methods
	public String CreateArchangel(String name, String prayer, String dateCeleb, String power, String color, double size, String essence, double lightDegree ) {
		String msg = "";
		if(NameEndsEl(name)== false) {
			msg += "The name doesn´t ends in el";
		}
		if(ValidName(name)== false) {
			msg += "\nThe name is already in use";
		}
		if(ValidPower(power)== false) {
			msg += "\nThe power is already in use";
		}
		if (msg.equalsIgnoreCase("")) {
			boolean angelinserted = false;
			for(int i = 0; i<angel.length && angelinserted == false; i++) {
				if(angel[i] == null) {
					Angel pangel = new Angel( name,  prayer, dateCeleb, power, color, size, essence, lightDegree);
					angel[i] = pangel;
					angelinserted = true;
					msg += "The angel has been inserted successfully";
				}
			}
			if (angelinserted==false) {
				msg += "No more space for angels :(";
			}
			
		}
		return msg;
	}
	
	public boolean NameEndsEl(String name) {
		boolean HasEl = false;
		int lg = name.length();
		if(name.charAt(lg-2) == 'e' && name.charAt(lg-1) == 'l') {
			HasEl = true;
		}
		return HasEl;
	}
	
	public boolean ValidName(String name) {
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
	
	public boolean ValidPower(String power) {
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
	
	public int CountArchangels() {
		int y = 0;
		for(int i = 0; i<angel.length; i++) {
			
			if(angel[i] != null) {
				y++;
			}
		}
		return y;
	}
	
	public String SearchByName(String name) {
		boolean nameFound = false;
		String msg = "Angel not found";
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
	
	public String SearchByPower(String power) {
		boolean powerFound = false;
		String msg = "Angel not found";
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




}
