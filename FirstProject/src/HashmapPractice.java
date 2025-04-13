import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.lang.*;

public class HashmapPractice {

	public static void main(String[] args) {
		
		
		Map<String,Integer> M1 = new HashMap();
		
		Map<String,Integer> M2 = new HashMap();

		M1.put("Rahul", 11);
		M1.put("Kanika", 2);
		M1.put("Rohit", 3);
		M1.put("Rajan", 4);
		M1.put("Kunj", 5);
		M1.put("Sandeep", 6);
		
		System.out.println(M1);
		
		M2.putAll(M1);
		
		System.out.println(M2);
		M2.put("Seven", 7);
		M2.put("Eight", 8);
		M2.remove("Rahul");
		
		System.out.println(M2);
		
		
		
		//("Kalki",3, null);
		
	System.out.println(M1);
	
	
		M1.merge("Rahul1",10,Integer::sum);
		System.out.println(M1);
		M1.merge("Rahul",20,(o,n)->n);
		System.out.println(M1);
		
		
		System.out.println("********");
		List<String> strings = List.of("one", "two", "three", "four", "five", "six", "seven","hundred");
		Map<Integer, String> map = new HashMap<>();
		for (String word: strings) {
		    int length = word.length();
		    map.merge(length, word, 
		              (existingValue, newWord) -> existingValue + ", " + newWord);
		}

		map.forEach((key, value) -> System.out.println(key + " :: " + value));
		
		System.out.println(map.get(4));
	}

}
