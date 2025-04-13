
public class prime {

	public static void main(JavaString[] args) {
		// TODO Auto-generated method stub
		 //Q4. WAP to check a number is prime or not?
		int Num1 = 30;
		int n = 2;
		int k=0;
	boolean isPrime = true;	
		
		
		while(n<Num1)
		{	
			if(Num1%n==0)
			{
				isPrime = false;
				break;
			}
			n++;
			
		}
		if (isPrime== true)
			System.out.println("Num1 is a prime number");
		else
			System.out.println("Num1 is not a prime number");

	}

	

	
	
}
