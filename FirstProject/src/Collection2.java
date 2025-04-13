import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Collection2 {

	public static void main(String[] args) {
		
		Employee1 E1= new Employee1("Rakesh", "Sharma", "Male", "9898989898");
		
		Employee1 E2= new Employee1("Mukesh", "Choudhary", "Male", "93375565456");
		
		Employee1 E3= new Employee1("Kalki", "Talreja", "Female", "9845675454");
		
		Employee1 E4= new Employee1("Naina", "Singh", "Female", "95344454556");
		
		
		ArrayList<Employee1> Emp = new ArrayList();
		
		Emp.add(E1);
		Emp.add(E2);
		Emp.add(E3);
		Emp.add(E4);
		
		boolean k ;
		for(Object e : Emp)
			if (k = e.toString().startsWith("M"))
				System.out.println(e);
		
		
		
			
	List<Employee1> fl=	Emp.stream().filter(p->p.Gender.equals("Female")).toList();
	
	Object[] E=	Emp.toArray();
	
	Object [] Ee =	Emp.toArray(new Object[Emp.size()]);
	
	System.out.println(fl);
	
	
	
	}

}
  class Employee1
    {
	  String FirstName ;
	  String LastName;
	  String Gender;
	  String MobileNumber;
	  
	  Employee1(String F,String L,String G,String M)
	  {
		  FirstName=F;
		  LastName =L;
		  Gender =G;
		  MobileNumber=M;
	 }
	  
	public String toString()  
	{
		return FirstName +" "+LastName+" "+Gender+" "+MobileNumber;
		
	}
  }