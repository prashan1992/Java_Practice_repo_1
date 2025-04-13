
public class FunctionforSumofTwoNumbers {

	public static void main(String[] args) {
		FunctionforSumofTwoNumbers  functionforSumofTwoNumbers = new FunctionforSumofTwoNumbers();
		functionforSumofTwoNumbers.sum(67,98);
		functionforSumofTwoNumbers.sum(24,"String");
		functionforSumofTwoNumbers.sum(56, 29,33);
		boolean B=		functionforSumofTwoNumbers.isPrime((97));
		System.out.println(B);
		
		int Maximum = functionforSumofTwoNumbers.MaximumOfThreeNumbers(14,45,67);
		
		System.out.print(Maximum);
		
		
		
	}
	
	void sum (int N1,int N2)
	{
		System.out.println(N1+N2);
		
	}
	void sum (int N1,String N2)
	{
		System.out.println(N1+N2);
		
	}

	void sum (int N1,int N2,int N3)
	{
		System.out.println(N1+N2+N3);
		
	}

	boolean isPrime(int N)
	{
		boolean Y= true;
		
		for(int i=2;i<N;i++) 
		{	
			if(N%i==0)
			Y= false;
			else
				Y=true;
			
		}		
		
		return Y;
		
	}

	int MaximumOfThreeNumbers(int N1,int N2,int N3) 
	{
		int Max = N1;
		if (Max<N2)
			Max = N2;
		if(Max<N3)
			Max=N3;
		
		return Max;
	}
	
	
	

}
