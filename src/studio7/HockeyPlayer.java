package studio7;

public class HockeyPlayer {
	
	// instance variables
	String name;
	int jerseyNumber;
	String shootingDirection;
	String mainHand;
	int goals;
	int assists;
	int points;
	int games;
	
	public HockeyPlayer(String name, int jerseyNumber, String shootingDirection, String mainHand, int goals,
			int assists, int games) {
		this.name = name;
		this.jerseyNumber = jerseyNumber;
		this.shootingDirection = shootingDirection;
		this.mainHand = mainHand;
		this.goals = goals;
		this.assists = assists;
		this.points = goals + assists;
		this.games = games;
	}







	public static void main(String[] args) {

	}

}
