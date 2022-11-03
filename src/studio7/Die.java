package studio7;

public class Die {
	
	// instance variables
	int n;  // the number of sides of a die
	
	// constructor
	public Die(int n) {
		this.n = n;
	}
	
	// method
	public int throwadie() {
		return (int) (Math.random() * this.n) + 1;
	}

	public static void main(String[] args) {
		Die a = new Die(6);
		System.out.println(a.throwadie());
	}

}
