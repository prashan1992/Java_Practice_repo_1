



public class CharArray {

	public static void main(JavaString[] args) {
		char A[]= {'C','F','G','H','L','K','M'};
		
		for(int i=0;i<A.length;i++)
		{	
			
		if (A[i]>=65 && A[i]<=90)
			A[i]+=32;
			
		}
		System.out.println(A);
	}

}
