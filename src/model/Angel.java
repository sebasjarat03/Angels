package model;

public class Angel {
	//Atributes
	private String Name;
	private String Prayer;
	private String DateCeleb;
	private String Power;
	private Candle candle;
	
	//constructor
	public Angel(String name, String prayer, String dateCeleb, String power, String color, double size, String essence, double lightDegree) {
		Name = name;
		Prayer = prayer;
		DateCeleb = dateCeleb;
		Power = power;
		CreateCandle( color,  size,  essence,  lightDegree);
		
	}
	
	//methods
	public void CreateCandle(String color, double size, String essence, double lightDegree) {
		Candle candle = new Candle( color,  size,  essence,  lightDegree);
		this.candle = candle;
	}
	
	public String toString() {
		String msg ="Name: "+ Name + "\nPrayer: " + Prayer + "\nDate of Celebration: " + DateCeleb + "\nPower: " + Power + candle.toString();
		
					
		return msg;
	}
	
	
	//getters and setters
	public String getName() {
		return Name;
	}
	
	public String getPower() {
		return Power;
	}
	

}
