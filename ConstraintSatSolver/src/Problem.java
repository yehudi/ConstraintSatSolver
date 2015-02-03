import java.util.ArrayList;
import java.util.List;

/*
 * @author nicokobak@hotmail.com
 */

public class Problem {
	private List<Domain> domains;
	private List<Constraint> constraints = new ArrayList<Constraint>();
	
	public Problem(List<Domain> domains){
		this.domains = domains;
	}
	
	
	public void addVariable(Domain domain){
		this.domains.add(domain);
	}
	
	public void addConstraint(Constraint constraint){
		this.constraints.add(constraint);
	}
	
	public Node initialNode(){
		return new Node(domains);
	}
	
	public Proof testSat(Node node){
		int faults = 0;
		for(Constraint c : constraints){
			if(!c.verify(node.getDomains())){
				faults++;
			}
		}
		if(faults == 0){
			boolean isSolution = true;
			for(Domain d : node.getDomains()){
				if(d.getSet().size() > 1){
					isSolution = false;
					break;
				}
			}
			
			if(isSolution){
				return new Proof(Proof.SUCCESS);
			}else{
				return new Proof(Proof.MIDDLE_NODE);
			}
		}
		
		return new Proof(Proof.FAILURE, faults);
	}
	
	public void printSolution(Node node){
		System.out.println(node.getDomains());
	}
	
}
