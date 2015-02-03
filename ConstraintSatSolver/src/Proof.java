
public class Proof {
	private int nFaults;
	private int state;
	
	public final static int FAILURE = 0;
	public final static int SUCCESS = 1;
	public final static int MIDDLE_NODE = 2;
	
	
	public Proof(int state){
		this.state = state;
	}
	
	public Proof(int state, int nFaults){
		this.state = state;
		this.nFaults = nFaults;
	}
	
	public int getState(){
		return this.state;
	}
	
	public int getNFaults(){
		return this.nFaults;
	}
}
