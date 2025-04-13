import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;

public class Collection5 {

	public static void main(String[] args) {
	
		List <String> fruits = Arrays.asList("Apple", "Banana", "Orange", "Guava", "Grapes", "Kivi");
		
		
		List<String> someFruits =fruits.subList(1, 3);
		System.out.println(fruits);
		System.out.println(someFruits);
		
		fruits.remove(3);
		//System.out.println(fruits);
		
		for(ListIterator<String> fruit = fruits.listIterator();fruit.hasNext();)
		{
			String s1 = fruit.next();
			
			if(Objects.equals(s1, "Guava"))
				fruit.set("Guawa");
		}
		
		System.out.println(fruits);
		
		
		for(ListIterator<String> fruit = fruits.listIterator();fruit.hasNext();)
		{
					
			if(fruit.next().equals("Guawa"))
				fruit.remove();
		}

	}

}
