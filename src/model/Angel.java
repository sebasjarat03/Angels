package model;

public class Angel {
	//Atributes
	private String name;
	private String prayer;
	private int day;
	private int month;
	private String power;
	private Candle candle;
	
	//constructor
	public Angel(String name, String prayer, int day, int month, String power, String color, double size, String essence, double lightDegree) {
		this.name = name;
		this.prayer = prayer;
		this.day = day;
		this.month = month;
		this.power = power;
		createCandle( color,  size,  essence,  lightDegree);
		
	}
	
	//methods
	
	/**
	*Name: createCandle<br>
	*Description: This method creates a candle for an angel<br>
	*@param color receives the color of the candle
	*@param size receives the size of the candle in centimeters
	*@param essence receives the essence of the candle
	*@param lightDegree receives the light degree of the candle in numbers
	*/
	public void createCandle(String color, double size, String essence, double lightDegree) {
		Candle candle = new Candle( color,  size,  essence,  lightDegree);
		this.candle = candle;
	}
	
	/**
	*Name: toString<br>
	*Description: This method put all the information of the angel into a string<br>
	*@return returns a String with the information of the angel
	*/
	public String toString() {
		String msg ="\nName: "+ name + "\nPrayer: " + prayer + "\nDate of Celebration: " +  monthToString() + " " + day + "\nPower: " + power + candle.toString();
		
					
		return msg;
	}
	
	/**
	*Name: toStringMonth<br>
	*Description: This method puts some information about the angel into a string. Not the same of the method toString<br>
	*@return returns a string with some information of the angel
	*/
	public String toStringMonth() {
		String msg = "\nName: " + name + "\nDay of celebration: " + day + candle.toStringMonth();
		return msg;
	}
	
	/**
	*Name: monthToString<br>
	*Description: This method converts the month of celebration from numbers to the name of the month<br>
	*@return returns the name of the month converted
	*/
	public String monthToString() {
		String monthString = "";
		switch(month) {
		case 1:
			monthString = "January";
			break;
		case 2:
			monthString = "February";
			break;
		case 3:
			monthString = "March";
			break;
		case 4:
			monthString = "April";
			break;
		case 5:
			monthString = "May";
			break;
		case 6:
			monthString = "June";
			break;
		case 7:
			monthString = "July";
			break;
		case 8:
			monthString = "August";
			break;
		case 9:
			monthString = "September";
			break;
		case 10:
			monthString = "October";
			break;
		case 11:
			monthString = "November";
			break;
		case 12:
			monthString = "December";
			break;
		default:
			monthString = "This month doesn't exists";
			break;
		}
		return monthString;
		
	}
	
	//getters and setters
	public String getName() {
		return name;
	}
	
	public String getPower() {
		return power;
	}
	
	public int getDay() {
		return day;
	}
	
	public int getMonth() {
		return month;
	}

}
