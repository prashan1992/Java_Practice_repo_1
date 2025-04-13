
public class Chair {
	
	private int Height;
	private int Width;
	private String Material;
	private boolean Backrest;
	

	Chair(int h,int w,String s,boolean b)
	{
		Height=h;
		Width=w;
		Material=s.toUpperCase().trim();
		Backrest=b; 
	}
	
	void showChair() {
		System.out.println("Height :"+Height);
		System.out.println("Width :"+Width);
		System.out.println("material : "+Material);
		System.out.println("Backrest : "+ Backrest);
	}

	
	
}
