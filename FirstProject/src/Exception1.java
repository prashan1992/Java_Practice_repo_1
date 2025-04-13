import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Exception1 {

	public static void main(String[] args) {
		
	/*	try
		{
			int num1 =5;
			int num2 =0;
			
			int Result = num1/num2;
			System.out.print(Result);
			System.out.println("ABC");
		}
		catch(ArithmeticException ex)
		{
			System.out.print("Exception caught");
		}
		
		
*/
		Exception1 E= new Exception1();
		//E.WithoutException();
		E.WithException();
		
		try
		{
			E.ExFunction();
		
		}
		catch(Exception e)
		{
			System.out.println("Exception caught"+ e.getMessage());
		}
		
		/*try {
			E.ExResource();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Exception caught"+ e.getMessage());
			e.printStackTrace();
		} */
		System.out.println("Hello");
	}
	
	
	void WithoutException()
	{
		System.out.println("WithoutException");
		int num1 =5;
		int num2 =0;
		
		int Result = num1/num2;
		System.out.print(Result);
		System.out.println("ABC");
	}
	
	
	void WithException()
	{
		
		System.out.println("WithException");
		try
		{
			int num1 =5;
			int num2 =1;
			
			int Result = num1/num2;
			System.out.print(Result);
			System.out.println("ABC");
		}
		catch(ArithmeticException ex)
		{
			System.out.println("Exception caught"+ ex.getMessage());
			System.out.println("Exception caught"+ ex.getStackTrace());
		
		}
		catch(Exception Ex)
		{
			System.out.println("Exception BaseClass Executed");
		}
		finally {
			System.out.println("Final Block Executed");
		}
		
	
	}
	
		void ExFunction() throws ArithmeticException
		{
			try
			{
				int num1 =5;
				int num2 =1;
				int []Arr= {10,20,40};
				
				
				int Result = num1/num2;
				System.out.print(Result);
				System.out.println("ABC");
				
				System.out.println(Arr[-3]);
				
			}
			catch(ArithmeticException ex)
			{
				System.out.println("from method");
				//System.out.println("Exception caught"+ ex.getMessage());
				//System.out.println("Exception caught"+ ex.getStackTrace());
				throw ex;
			}			
			
		}
	
		void ExResource() throws FileNotFoundException
		{
			try(PrintStream stream = new PrintStream("C:\\Javafiles\\hello.txt")){
				stream.print("Write in file");
			} catch(FileNotFoundException f)
			{
				System.out.println("from catch");
				throw f;
				
			}
		}
	
	
	
}



