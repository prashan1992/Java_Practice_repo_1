package MyPack1;

public class WrapperEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String StNum ="System.out.print(result)1454653";
		Integer num1=10;
		System.out.println(num1);
		
		Integer num2=Integer.valueOf(num1);
		num2=Integer.valueOf("6");
		
		System.out.println(num2);
		
		System.out.println("Min Value |:"+Integer.MIN_VALUE+"\n Max Value :" + Integer.MAX_VALUE);
		
		System.out.println(Integer.getInteger(StNum,12));
		
		System.out.println(Integer.decode("O0345"));
		
	}

}
