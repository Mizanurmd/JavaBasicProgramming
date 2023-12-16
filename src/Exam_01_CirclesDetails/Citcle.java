package Exam_01_CirclesDetails;

public class Citcle {
	private double radius;
	private String color;
	
	
	//// 1st constructor
	public Citcle() {
		this.radius =2.0;
		this.color ="Red";
	}

	// 2nd constructor
	public Citcle(double r) {
		this.radius = r;
	}
	
	// 3rd constructor 
	public Citcle(double ra, String c) {
		this.radius = ra;
		this.color = c;
	}
	
	// 1st radius method here
	
	public double getRadiu() {
		return radius;
	}
	// 2nd method
	
	public double getArea() {
		
		double area = radius * radius * Math.PI;
		return area;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Citcle [radius=" + radius + ", color=" + color + "]";
	}
	
	
	
}
