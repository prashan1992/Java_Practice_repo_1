import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class Collection1 {

	public static void main(String[] args) {
	
		
		ArrayList c1 = new ArrayList();
		 
		c1.add(9);
		c1.add(8);
		c1.add(7);
		c1.add(8);
		c1.add(5);
		
		System.out.println(c1);
		
		ArrayList c3 = new ArrayList();
		 
		c3.add(9);
		c3.add(8);
		c3.add(7);
		c3.add(5);
		c3.add(8);
		
		System.out.println(c1);
		
		
		
		
		ArrayList c2 = new ArrayList();	
		
		
		c2.add(8);
		c2.add(7);
		c2.add(2);
		c2.add(3);
		c2.add(4);
		c2.add(5);
		c2.add(6);
		
		System.out.println(c2);
		
		for(Object k:c2)
		{
			String ck = k.toString();
			
			System.out.println(c3);
		}

		List<String> c4 =new ArrayList();	
		
		
		c4.add("is");
		c4.add("My");
		c4.add("Love");
		
		c4.addFirst("India");
		//c4.add("I");
		
		
		System.out.println(c4);
		
		
		
		
		Collection c5 = new ArrayList();	
		
		c5.addAll(c2);
		System.out.println(c5);
		
		System.out.println("----------------");
		
		//System.out.println(c1.addAll(c2));
		
		System.out.println(c1);
		c1.addAll(3, c2);
		System.out.println("----------------");
		System.out.println(c1.contains("k"));
		System.out.println(c1.contains(5));
		
		System.out.println(c1.equals(c2));
		
		System.out.println("----------------");
		System.out.println(c1.equals(c3));
		System.out.println(c1);
		System.out.println(c2);
		c1.remove(0);
		System.out.println(c1);
		
		System.out.println(c1.size());
		System.out.println(c1.isEmpty());
		
		
		
		//1.Write a program To find duplicates between two lists?
		System.out.println("----------------");
		System.out.println(c1);
		System.out.println("----------------");
		System.out.println(c2);
		System.out.println("----------------");
		Collection c6 = new ArrayList();
		Collection c7 = new ArrayList();
		Collection c8 = new ArrayList();
		c8.add("k");
		
		
		
		for(Object K:c1)
		{
			if(c2.contains(K))
					c6.add(K);
		}
		
		for(Object M:c6)
		{
			// Check if M is already present in C7
			if(!c7.contains(M))
				c7.add(M);
			
		}
		
		System.out.println("C7:"+c7);
		

		HashSet<Integer> hs1=new HashSet<Integer>(c6);
		
		System.out.println("HS1:"+hs1);
		
		System.out.println("----------------");	
		
		c1.retainAll(c2);
		System.out.println(c1);
		
		
		c6.removeIf(n -> n == Integer.valueOf(2));
		System.out.println("C6="+c6);
		c8.addAll(c6);
		System.out.println(c8);
		
		
		c8.removeIf(n -> n == Integer.valueOf(8));
		System.out.println("C6="+c8);
		
		
		
		}
	
	
	
	
	
		
	}


