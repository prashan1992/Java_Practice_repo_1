
public class Exception2 {

	public static void main(String[] args) {
		
		Exception2 Excp = new Exception2();
		
		//Excp.ArithExep();
		try
		{
			 Excp.ArithExep(0,7);
		}
		catch(ArithmeticException | ArrayIndexOutOfBoundsException Ex2)
		{
			//System.out.print("Exception caught : -"+Ex2.getClass());	
			System.out.print("Exception caught : -"+Ex2.getMessage());
		
		}
		
		
		try
		{
			 Excp.testmyException(900,100);
		}
		catch(myException m)
		{
			//System.out.print("Exception caught : -"+Ex2.getClass());	
			System.out.print("Exception caught : -"+ m.ExceptionMessage());
		
		}
		
	}
	
	
	
			void ArithExep(int div, int index) throws ArithmeticException,ArrayIndexOutOfBoundsException
			{
				int num1 = 5;
				int num2= 0;
				int[] Arr = {2,5,7,9,12,14};
				
				try 
				{
					int result = num1/div;
					System.out.print(result);
					System.out.print(Arr[index]);
				}
				catch(ArithmeticException | ArrayIndexOutOfBoundsException E)
				{
					System.out.println("Exceptionfrom ArithExep:-");
					throw E;
				}
			}
			
			void testmyException(int num,int max) throws myException
			{
				if (num>max)
					throw new myException();
			
			}
			
			
}

class myException extends Exception
{

	String ExceptionMessage()
	{
	
			return "My Custom Exception";
	}
}
				
				
					
	
	
	

