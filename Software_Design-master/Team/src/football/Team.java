package football;

public class Team {
	
  private int games_played=0;
   private int points=0;

	public int read_games_played() {
		// TODO Auto-generated method stub
		return this.games_played;
	}

	public int read_points() {
		// TODO Auto-generated method stub
		return this.points;
	}

	public void win() {
		this.points+=3;
		this.games_played+=1;
		
		
	}

	public void draw() {
		// TODO Auto-generated method stub
		
		this.points+=1;
		this.games_played+=1;
	}

	public void loss() {
		// TODO Auto-generated method stub
		this.games_played+=1;
	}

	public void reset() {
		// TODO Auto-generated method stub
		this.points=0;
		this.games_played=0;
	}

	public String print_details() {
		return "Games Played"+read_games_played()+" "+"\nPoints : "+read_points(); 
		
	}

}
