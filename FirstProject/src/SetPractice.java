import java.util.ArrayList;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetPractice {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList();
		list.add("Apple");
	//	list.add(2);
		list.add("Banana");
	//	list.add(6);
		list.add("Orange");
	//	list.add(8);
		list.add("Banana");
	//	list.add(7);
		list.add("Grapes");
		list.add("Banana");
		list.add("Kivi");
		list.add("Guava");
		
		

		System.out.println(list);
		
	Set<String> set1 = Set.copyOf(list);
		
	System.out.println(set1);
	
	SortedSet<String> set2 = new TreeSet<String>(set1);
	
	System.out.println(set2);
	Set set3 =	set2.reversed();
	System.out.println(set3);
	System.out.println("---------------------------");
	System.out.println(set2.headSet("Kivi"));
	System.out.println("---------------------------");
	System.out.println(set2.tailSet("Guava"));
	System.out.println("---------------------------");
	System.out.println(set2.subSet("Apple","Guava"));
	
	NavigableSet<String> set4 = new TreeSet<String>(set1);
	System.out.println("----------*****-----------------");	
	System.out.println(set4);
	System.out.println("---------------------------");	
	System.out.println(set4.descendingSet());
	System.out.println("---------------------------");	
	System.out.println(set4.ceiling(""));
	
	
	}

}
