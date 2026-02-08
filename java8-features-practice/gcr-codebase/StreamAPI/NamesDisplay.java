import java.util.Arrays;
import java.util.List;

public class NamesDisplay {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("rahul", "Amit", "neha", "Karan");
		
		List<String> result = names.stream().map(n -> n.toUpperCase()).sorted().toList();
		System.out.println(result);

	}

}
