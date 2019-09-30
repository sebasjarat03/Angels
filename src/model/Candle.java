package model;

public class Candle {
	//Atributes
	private String color;
	private double size;
	private String essence;
	private double lightDegree;
	
	//methods
	public Candle(String color, double size, String essence, double lightDegree) {
		this.color = color;
		this.size = size;
		this.essence = essence;
		this.lightDegree = lightDegree;
	}
	
	public String toString() {
		String msg = "\nColor: " + color + "\nSize: " + size + "\nEssence: " + essence + "\nLight Degree: " + lightDegree;
		return msg;
	}
	
	public String toStringMonth() {
		String msg = "\nColor: " + color + "\nEssence: " + essence;
		return msg;
	}
	

}
