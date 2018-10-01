package q2;

public class Match {
	private String name;
	private String team1;
	private String team2;
	Counter score1;
	Counter score2;
	public Match(String team1, String team2) {
		// TODO Auto-generated constructor stub
		this.team1=team1;
		this.team2=team2;
		score1=new Counter(0);
		score2=new Counter(0);
	}

	public void team1_score() {
		// TODO Auto-generated method stub
		score1.increment();
	}

	public void team2_score() {
		// TODO Auto-generated method stub
		score2.increment();
	}

	public String print_score() {
		// TODO Auto-generated method stub
		return ""+read_team1name()+"Score: "+read_team1_score()+"\n"+read_team2name()+"Score: "+read_team2_score();
	}

	private String read_team2name() {
		// TODO Auto-generated method stub
		return this.team2;
	}

	private String read_team1name() {
		// TODO Auto-generated method stub
		return this.team1;
	}

	private int read_team2_score() {
		// TODO Auto-generated method stub
		return score2.read_value();
	}

	private int read_team1_score() {
		// TODO Auto-generated method stub
		return score1.read_value();
	}

}
