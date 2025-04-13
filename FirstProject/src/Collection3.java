import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Collection3 {

	public static void main(String[] args) {
		
		Collection <String> c1 = new ArrayList();
		
		Collection c2=List.of("Apple", "Banana", "Orange", "Guava", "Grapes", "Kivi");
		c1.addAll(c2);
		
		for(Iterator<String> k=c1.iterator();k.hasNext();)
		{
			String s1 = k.next();
			if(s1=="Guava")
				 c1.remove(s1);
			
			System.out.println(s1);
			
			
		}
		
	}

}
