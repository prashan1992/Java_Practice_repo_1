import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Collections {

	public static void main(String[] args) {
		
		Collection cl= new ArrayList();
		
		cl.add(10);
		cl.add(20);
		cl.add(30);
		cl.add(40);
		cl.add(50);
		
		cl.add("A");
		cl.add("B");
		cl.add(10.76);
		//cl.addFirst(10.76);

		
		for(Object O : cl)
		{
			System.out.println(O);
			
			//int num=Integer.parseInt(O.toString());
			
		//	System.out.println("num="+num);
		}
		
		
		
		// With Generics\
		
		ArrayList<Integer> cl1= new ArrayList<Integer>();
		
		cl1.add(10);
		cl1.add(20);
		cl1.add(30);
		cl1.add(40);
		cl1.add(50);
		
		System.out.println(cl1);
		
		System.out.println("*******");
		for(Object O : cl1)
		{
			System.out.println(O);
			
			int num=Integer.parseInt(O.toString());
			
			System.out.println("num1="+num);
		}
		
		//cl.addFirst(10.76);
		
		
	}

}
