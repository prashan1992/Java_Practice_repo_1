import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Collection4 {

	public static void main(String[] args) {
		Collection<String> strings = new ArrayList<>();
		strings.add("one");
		strings.add("two");
		strings.add("three");

		Iterator<String> iterator = strings.iterator();
		while (iterator.hasNext()) {

		    String element = iterator.next();
		    strings.remove(element);
		}

	//	System.out.print(strings);
		
		
	}

}
