
public class CustomException {

	public static void main(String[] args){
		
		CustomException CN = new CustomException();
		try {
			CN.MethodCustomException(10);
		} catch (CustomException.CustException e) {
			
			System.out.println(e.getMessage());
		}
	}

	class CustException extends Exception
	{
		
		String CustMessage()
		{
			return "Custom Message Printed";
			
		}
		
		CustException(String msg)
		{
			super(msg);
			
		}
		
		
		
		
	}
	
	void MethodCustomException (int N) throws CustException
	{
		
		if (N> 100)
			throw new CustException("Greater than 100");
		if (N< 100)
			throw new CustException("Less than 100");
	}
	
	
}
