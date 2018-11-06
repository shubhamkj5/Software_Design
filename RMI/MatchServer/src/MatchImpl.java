import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MatchImpl extends UnicastRemoteObject implements Match  {
	private int team1_score, team2_score;
    private String team1_name, team2_name;
	protected MatchImpl(String t1, String t2) throws RemoteException {
		 this.team1_name=t1;
		    this.team2_name=t2;
			this.team1_score=0;
			this.team2_score=0;
	}

	@Override
	public void team1_goal() throws RemoteException {
		this.team1_score++;
	}

	@Override
	public void team2_goal() throws RemoteException {
		this.team2_score++;
		
	}

	@Override
	public String read_result() throws RemoteException {
		String res="\n";
		res+= (team1_name+"    "+team2_name+"\n");
		res+= ("  "+team1_score+"       "+team2_score)+"\n\n";
		return res;
	}

}
