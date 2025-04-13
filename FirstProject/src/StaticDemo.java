
public class StaticDemo {
	
	
	static int iNum1=0; // Class variable
	int iNum2=0; // Instance Variable
	
	StaticDemo()
	{
		System.out.println("Constructor Invoked");
	}
	
	void incr()
	{
		iNum1++;
		iNum2++;
	}
	
	void print()
	{
		System.out.println(iNum1+" "+ iNum2);
	}
	
	static void print1()
	{
		System.out.println(iNum1);
	}
	
	static {
		
		iNum1 =100;
		System.out.println("Static Block");
		
		
		
		
	}

}


