
public class MaximunValueinArray {

	public static void main(JavaString[] args) {
		int [] k= {2,3,4,5,12,7,8};
		
		int max=k[0];
		
		for(int e:k)
			if ( max <e)
				max=e;
		
		System.out.print(max);
		

	}

}
