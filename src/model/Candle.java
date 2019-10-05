package model;

public class Candle {
	//Atributes
	private String color;
	private double size;
	private String essence;
	private double lightDegree;
	
	//constructor
	public Candle(String color, double size, String essence, double lightDegree) {
		this.color = color;
		this.size = size;
		this.essence = essence;
		this.lightDegree = lightDegree;
	}
	
	//methods
	
	/**
	*Name: toString<br>
	*Description: This method puts all the information of the candle into a string<br>
	*@return returns a String with all the information of the candle
	*/
	public String toString() {
		String msg = "\nColor: " + color + "\nSize: " + size + "\nEssence: " + essence + "\nLight Degree: " + lightDegree;
		return msg;
	}
	
	/**
	*Name: toStringMonth<br>
	*Description: This method puts some information of the candle into a string. Not the same info of the method toString<br>
	*@return returns a string with some information of the candle
	*/
	public String toStringMonth() {
		String msg = "\nColor: " + color + "\nEssence: " + essence;
		return msg;
	}
	

}
