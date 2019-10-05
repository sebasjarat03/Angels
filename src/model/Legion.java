package model;

public class Legion {
	//atributes
	private Angel[] angel;
	
	//Constructor
	public Legion(int i) {
		angel = new Angel[i];
		
	}
	
	//methods
	/**
	*Name: createArchangel<br>
	*Description: This method creates an object of Angel's type<br>
	*@param name receives the name of the angel
	*@param prayer receives the prayer of the angel
	*@param day receives the day of the celebration in numbers
	*@param month receives the month of celebration in numbers
	*@param power receives the power of the angel
	*@param color receives the color of the angel's candle
	*@param size receives the size of the angel's candle in centimeters
	*@param essence receives the essence of the angel's candle
	*@param lightDegree receives the light degree of the angel's candle in numbers
	*@return returns a message saying if there is some error or if the angel has been created successfully
	*/
	public String createArchangel(String name, String prayer, int day, int month, String power, String color, double size, String essence, double lightDegree ) {
		String msg = "";
		if(nameEndsEl(name)== false) {
			msg += "Error! \nThe name doesn´t ends in el";
		}
		if(validName(name)== false) {
			msg += "\nError! \nThe name is already in use";
		}
		if(validPower(power)== false) {
			msg += "\nError! \nThe power is already in use";
		}
		if(!validDay(day)) {
			msg += "\nError! \nThe day has to be between 1 and 31";
		}
		if(!validMonth(month)) {
			msg += "\nError! \nThe month has to be between 1 and 12";
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
	
	/**
	*Name: nameEndsEl<br>
	*Description: This method checks if the name of the angel ends in "el"
	*@param name receives the name of the angel
	*@return returns true if the name ends in el or false if the name does not ends in el
	*/
	public boolean nameEndsEl(String name) {
		boolean hasEl = false;
		int lg = name.length();
		if(name.charAt(lg-2) == 'e' && name.charAt(lg-1) == 'l') {
			hasEl = true;
		}
		return hasEl;
	}
	
	/**
	*Name: validName<br>
	*Description: This method checks if the name of the angel is available and that other angel doesn't have it<br>
	*@param name receives the name of the new angel
	*@return returns a boolean, true if the name is not in use and false if the name is already in use
	*/
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
	
	/**
	*Name: validPower<br>
	*Description: This method checks if the power of the new angel is available and that there is no other angel that has it<br>
	*@param power receives the power of the new angel
	*@return returns a boolean, true if the power is not in use and false if the power is already in use
	*/
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
	
	/**
	*Name: countArchangels<br>
	*Description: This method counts how many angels has the user created<br>
	*@return gives back the number of existing angels
	*/
	public int countArchangels() {
		int y = 0;
		for(int i = 0; i<angel.length; i++) {
			
			if(angel[i] != null) {
				y++;
			}
		}
		return y;
	}
	
	/**
	*Name: searchByName<br>
	*Description: This method gives you the information of an existing angel searching his name<br>
	*@param name receives the name of the angel that you want to see info
	*@return returns a String with the info of the angel, if the angel is not registered yet, it gives you back a message saying that the angel can't be found
	*/
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
	
	/**
	*Name: searchByPower<br>
	*Description: This method gives you the information of an existing angel searching his power<br>
	*@param power receives the power of the angel that you want to see the info
	*@return returns a String with the info of the angel, if the power of the angel is not registered yet, it gives you back a message saying that the angel can't be found
	*/
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
	
	/**
	*Name: searchByMonth<br>
	*Description: This method gives you some information of the existing angels searching by their celebration's month<br>
	*@param month receives in numbers the celebration's month of the angels that you want to see info
	*@return returns the angels that have a celebration on that month and some of their information. If the month doesn't have any angel, it gives you back a
	*message saying that the month doesn't have angels
	*/
	public String searchByMonth(int month) {
		
		String msg = "";
		for (int i = 0; i<angel.length; i++) {
			if(angel[i] != null) {
				if(angel[i].getMonth()==month) {
					
					msg += "\n" + angel[i].toStringMonth() + "\n";
					
				}
				
				}
			}
		if(msg.equalsIgnoreCase("")) {
			msg += "\nThis month doesn't have any angels";
		}
		return msg;
	}
	
	/**
	*Name: showAll<br>
	*Description: This method shows you all the created angels with their date of celebration<br>
	*@return returns all the registered angels with their date of celebration. If there is any angel created it gives you back a message saying that there is no angels created
	*/
	public String showAll() {
		String msg = "";
		for (int i = 0; i<angel.length; i++) {
			if(angel[i] != null) {
				msg += "\nAngel #" + (i+1) + ": " + angel[i].getName() + ": "+ angel[i].monthToString() + " "  + angel[i].getDay()   + "\n";
			}
		}
		if (msg.equalsIgnoreCase("")) {
			msg += "\nAngels not created yet";
		}
		return msg;
	}
	
	/**
	 * Name: validDay<br>
	 * Description: This method checks if the day's number is between 1 and 31<br>
	 * @param day receives the angel's celebration's day
	 * @return returns a boolean, true if the day is valid or false if is invalid
	 */
	public boolean validDay(int day) {
		boolean valid = false;
		if(day>0 && day<32) {
			valid = true;
		}
		return valid;
	}
	
	/**
	 * Name: validMonth<br>
	 * Description: This method checks if the month's number is between 1 and 12<br>
	 * @param month receives the angel's celebration's month
	 * @return returns a boolean, true if the month is valid or false if is invalid
	 */
	public boolean validMonth(int month) {
		boolean valid = false;
		if(month>0 && month<13) {
			valid = true;
		}
		return valid;
	}




}
