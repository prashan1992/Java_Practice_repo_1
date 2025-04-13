
import java.util.Date;
import java.util.Calendar;

public class Employee {

private	int EmployeeID;
private String FirstName;
private	String LastName;
private	char Gender;
private	Date DOB;
private	Date DOJ; 
private	String FullName;
	
	
	Employee(int EmployeeID,String F,String L,char G)
	{
		 this.EmployeeID =EmployeeID;
		  FirstName =F;
		  LastName=L;
		  Gender=G;
		  FullName=F+" "+L;
		
		DOB=  new Date();
		Calendar c1 = Calendar.getInstance();
		c1.set(2001,12,19);
		DOB=c1.getTime();
		c1.add(Calendar.DAY_OF_MONTH,5);
		DOJ=c1.getTime();
	}
	
	
	Employee()
	{
		this(21,"FirstName","LastName",'M');
	}
	
	
	//Copy Constructor
	
	Employee(Employee e1)
	{
		System.out.println("Copy Constructor Invoked");
		this.EmployeeID=e1.EmployeeID;
	
	}
	
	void ShowEmployee()
	{
	 System.out.println("EmployeeID:"+EmployeeID);
	 System.out.println("FirstName:"+FirstName);
	 System.out.println("LastName:"+LastName);
	 System.out.println("FullName:"+FullName);
	 System.out.println("Gender:"+Gender);
	 System.out.println("DOB:"+DOB);
	 System.out.println("DOJ:"+DOJ);
	 
	}
	
	String getFirstName()
	{
		return FirstName;
	}
	
	void setFirstName(String FN)
	{
		FirstName = FN;
		// FullName=FN+" "+LastName;
		setFullName();
	}
	
private	void setFullName()
	{
		  FullName=FirstName+" "+LastName;
	}
	
}
