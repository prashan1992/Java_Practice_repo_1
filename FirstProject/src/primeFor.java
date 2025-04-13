
public class primeFor {

	public static void main(JavaString[] args) {
		
		int Num1 = 36;
		
		int k=0;

		
		for(int n =2;n<Num1;n++ )
			
		{
			
			if(Num1%n==0)
				k++;
			if (k>0)
			{	
			System.out.println("Num1 is not a prime number");
			break;
			}
			else
				System.out.println("Num1 is a prime number");
			break;
		}
	
				
		
	}

}
