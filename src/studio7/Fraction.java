package studio7;

public class Fraction {
	
	// instance variables
	int numerator;
	int denominator;
	
	public String toString() {
		return "Fraction [numerator=" + numerator + ", denominator=" + denominator + "]";
	}

	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}
	
	public Fraction multiply(Fraction another) {
		int newNumerator =  (this.numerator * another.numerator);
		int newDenominator = (this.denominator * another.denominator);
		Fraction newFraction = new Fraction(newNumerator, newDenominator);
		return newFraction;
	}
	
	public Fraction reciprocal() {
		int newNumerator =  (this.denominator);
		int newDenominator = (this.numerator);
		Fraction newFraction = new Fraction(newNumerator, newDenominator);
		return newFraction;
	}
	
	public Fraction add(Fraction another) {
		int newNumerator =  (this.numerator * another.denominator + this.denominator * another.numerator);
		int newDenominator = (this.denominator * another.denominator);
		Fraction newFraction = new Fraction(newNumerator, newDenominator);
		return newFraction;
	}
	
	public Fraction simplify() {
		int gcdNumber = gcd(this.numerator, this.denominator);
		int newNumerator = this.numerator / gcdNumber;
		int newDenominator = this.denominator / gcdNumber;
		Fraction newFraction = new Fraction(newNumerator, newDenominator);
		return newFraction;	
	}
	
	public static int gcd(int p, int q) {
		while (q != 0) {
			int temp = q;
			q = p % q;
			p = temp;
		}
		return p;
	}
	
	public static void main(String[] args) {
		Fraction a = new Fraction(2, 3);
		Fraction b = new Fraction(3, 4);
		System.out.println(a.multiply(b).toString());
		System.out.println(a.reciprocal().toString());
		System.out.println(a.add(b).toString());
		Fraction c = new Fraction(6, 12);
		System.out.println(c.simplify().toString());
	}
	
}
