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
	public void createCandle(String color, double size, String essence, double lightDegree) {
		Candle candle = new Candle( color,  size,  essence,  lightDegree);
		this.candle = candle;
	}
	
	public String toString() {
		String msg ="Name: "+ name + "\nPrayer: " + prayer + "\nDate of Celebration: " + day + " of " + monthToString() + "\nPower: " + power + candle.toString();
		
					
		return msg;
	}
	
	public String toStringMonth() {
		String msg = "Name: " + name + "\nDay of celebration: " + day + candle.toStringMonth();
		return msg;
	}
	
	public String monthToString() {
		String monthString = "";
		switch(month) {
		case 1:
			monthString = "january";
			break;
		case 2:
			monthString = "february";
			break;
		case 3:
			monthString = "march";
			break;
		case 4:
			monthString = "april";
			break;
		case 5:
			monthString = "may";
			break;
		case 6:
			monthString = "june";
			break;
		case 7:
			monthString = "july";
			break;
		case 8:
			monthString = "august";
			break;
		case 9:
			monthString = "september";
			break;
		case 10:
			monthString = "october";
			break;
		case 11:
			monthString = "november";
			break;
		case 12:
			monthString = "december";
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
