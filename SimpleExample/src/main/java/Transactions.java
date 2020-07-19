import java.util.ArrayList;
import java.util.List;

public class Transactions {

	private List<Integer> numbers;
	
	public Transactions() {
		numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(3);
	}
	
	public Integer getIndex(Integer i) {
		try {
			return numbers.get(i);			
		} catch(Exception e) {
			System.out.println("An exception was thrown");
			e.printStackTrace();
			return 0;
		} 
	}
}
