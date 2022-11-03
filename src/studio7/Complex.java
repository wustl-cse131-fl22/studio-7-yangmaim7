package studio7;

public class Complex {
	
	// instance variables
	double a;
	double b;
	
	public String toString() {
		return "Complex " + a + " + " + b + "i";
	}

	public Complex(double a, double b) {
		this.a = a;
		this.b = b;
	}

	public Complex add(Complex another) {
		double newA = (this.a + another.a);
		double newB = (this.b + another.b);
		Complex newComplex = new Complex(newA, newB);
		return newComplex;
	}

	public Complex multiply(Complex another) {
		double newA = (this.a * another.a - this.b * another.b);
		double newB = (this.a * another.b + this.b * another.a);
		Complex newComplex = new Complex(newA, newB);
		return newComplex;
	}
	
	public static void main(String[] args) {
		Complex a = new Complex(1, 2);
		Complex b = new Complex(3, 4);
		System.out.println(a.toString());
		System.out.println(a.add(b).toString());
		System.out.println(a.multiply(b).toString());
	}

	
}
