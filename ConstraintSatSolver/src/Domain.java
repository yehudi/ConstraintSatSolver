import java.util.Set;


public class Domain {
	private Set<Integer> set;
	private int n;
	
	public Domain(int n, Set<Integer> set){
		this.n = n;
		this.set = set;
	}

	public Set<Integer> getSet() {
		return set;
	}

	public void setSet(Set<Integer> set) {
		this.set = set;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
	
	public String toString(){
		return this.set.toString();
		
	}
}
