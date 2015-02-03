import java.util.List;


public class Node {
	private List<Domain> domains;
	
	public List<Domain> getDomains() {
		return domains;
	}

	public void setDomains(List<Domain> domains) {
		this.domains = domains;
	}

	public Node(List<Domain> domains){
		this.domains = domains;
	}
}
