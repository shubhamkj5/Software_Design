package q1;

public class Team {
	private String name;
  private Counter games_played;
   private Counter points;

	public Team(String name, int games_played, int points) {
	// TODO Auto-generated constructor stub
	
		this.name=name;
		this.games_played=new  Counter(games_played);;
		this.points=new  Counter(points);;
}

	public int read_games_played() {
		// TODO Auto-generated method stub
		return games_played.read_value();
	}

	public int read_points() {
		// TODO Auto-generated method stub
		return points.read_value();
	}
	private String read_name() {
		// TODO Auto-generated method stub
		return this.name;
	}
	public void win() {
		points.increment();
		points.increment();
		points.increment();
		games_played.increment();		
	}

	public void draw() {
		// TODO Auto-generated method stub
		
		points.increment();
		games_played.increment();		
	}

	public void loss() {
		// TODO Auto-generated method stub
		
		games_played.increment();		
	}

	public void reset() {
		// TODO Auto-generated method stub
		points.resetv();
		games_played.resetv();	
		
	}

	public String print_details() {
		return  "Team Name: "+read_name()+"Games Played"+read_games_played()+" "+"\nPoints : "+read_points(); 
		
	}

	

}