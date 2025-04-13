
public class SumOfTwoArray {

	public static void main(JavaString[] args) {
		int A[][]= {{1,2,3,4},{6,7,8,9}};
		int B[][]= {{7,8,9,4},{5,4,0,9}};
		int C[][]= new int[2][4];
		
		//sum
		for(int i=0;i<2;i++)
		{	
			for(int j=0;j<=3;j++)
				
				C[i][j]=A[i][j]+B[i][j];
				
				
		}		
		
		// print result
		for(int i=0;i<2;i++)
		{	
			System.out.println();
			for(int j=0;j<=3;j++)
				System.out.print("  "+C[i][j]);
		
		}
	}

}
