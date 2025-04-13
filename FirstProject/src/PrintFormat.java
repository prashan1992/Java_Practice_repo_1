
public class PrintFormat {

	public static void main(String[] args) {
		
		long num1= 2345897;
		System.out.format("%d%n", num1);
		System.out.format("%+09d%n", num1);
		
		
		float k= 9.8f;
		
		System.out.format("%09.3f", k);
	}

}
