package studio7;

import edu.princeton.cs.introcs.StdDraw;

public class Rectangle {
	
	// instance variables
	double length;
	double width;
	double area;
	double perimeter;
	
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + ", area=" + area + ", perimeter=" + perimeter + "]";
	}

	// constructor
	public Rectangle(double initLength, double initWidth) {
		this.length = initLength;
		this.width = initWidth;
		this.area = initLength * initWidth;
		this.perimeter = (initLength + initWidth) * 2;
	}
	
	// getter and setter 
	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getArea() {
		return area;
	}

	public double getPerimeter() {
		return perimeter;
	}

	// custom methods
	public boolean isSmallerInAreaThan(Rectangle another) {
		if (this.area < another.area) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isSquare() {
		if (this.length == this.width) {
			return true;
		} else {
			return false;
		}
	}
	
	public void draw() {
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.filledRectangle(0.5, 0.5, this.width/2.0, this.length/2.0);
	}
	
	
	
	public static void main(String[] args) {
		Rectangle a = new Rectangle(0.2, 0.3);
		Rectangle b = new Rectangle(0.3, 0.4);
		System.out.println(a.isSmallerInAreaThan(b));
		a.draw();
		System.out.println(a.toString());
	}
}

