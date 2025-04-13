
public class PracticeQuestions {

	public static void main(JavaString[] args) {
		// TODO Auto-generated method stub
 int N1=10;
 int N2=21;
 System.out.println("1. Add");
 System.out.println("2. Substact");
 System.out.println("3. Multiply");
 System.out.println("4. Divide");
 System.out.println("Enter your choice");
 int ch=0;
 
 if (ch==1)
 System.out.println(N1+N2);
 
 else if (ch==2)
 System.out.println(N1-N2);
 
 else if (ch==3)
	 System.out.println(N1*N2);
 else 
	 if (ch==4)
	 System.out.println(N1/N2);
 else  
	 System.out.println("Please Enter Valid Oparator");
 
	

	//Nested if else else if
	
	
	
	int a = 1110;
	int b= 168;
	int c= 1089;
	
	if (a>b)
     {
		if (a>c)
     		 System.out.println("a is greatest among all integers");	
     	else 
     		 System.out.println("c is greatest among all integers");
     }
	else if (a>c)  
	{
		if (b>a)
			System.out.println("b is greatest among all integers");	
		else
			System.out.println("c is greatest among all integers");
	}
	else
		System.out.println("c is greatest among all integers");
     	
	/*
	
	JavaString G = "Female";
	JavaString Q = "Post";
	int A = 9;
	
	
	if (G=="Male")
	{
		if (A>=10)
		{
			if(Q=="Graduate")
				System.out.println("Your Salary will be 10000");
			else if (Q=="Post-Graduate")
				System.out.println("Your Salary will be 15000");
			else
				System.out.println("Disqualified");
				
		}	
		else
		{
			if(Q=="Graduate")
				System.out.println("Your Salary will be 7000");
			else if (Q=="Post-Graduate")
				System.out.println("Your Salary will be 10000");
			else
				System.out.println("Disqualified");	
		}	
		
		}
	else if (G=="Female")
	{	
		if (A>=10)
		{
			if(Q=="Graduate")
				System.out.println("Your Salary will be 90000");
			else if (Q=="Post-Graduate")
				System.out.println("Your Salary will be 12000");
			else
				System.out.println("Disqualified");
				
		}	
		else
		{
			if(Q=="Graduate")
				System.out.println("Your Salary will be 6000");
			else if (Q=="Post-Graduate")
				System.out.println("Your Salary will be 10000");
			else
				System.out.println("Disqualified");	
		}	
		
		}
	else
		System.out.println("Type correct gender info");
		
		*/
	}	

		
}	
	
	
	
	


