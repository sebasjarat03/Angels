package model;

public class Candle {
	//Atributes
	private String Color;
	private double Size;
	private String Essence;
	private double LightDegree;
	
	//methods
	public Candle(String color, double size, String essence, double lightDegree) {
		Color = color;
		Size = size;
		Essence = essence;
		LightDegree = lightDegree;
	}
	
	public String toString() {
		String msg = "\nColor: " + Color + "\nSize: " + Size + "\nEssence: " + Essence + "\nLight Degree: " + LightDegree;
		return msg;
	}
	
	

}
