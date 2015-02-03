import java.util.List;


public interface Constraint {
	boolean verify(List<Domain> domains);
}
