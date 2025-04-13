
class Parent 

{
	int A = 15;
	int B= 23;
	String C = "Inherit";
	protected void Display()
		{
			System.out.println(A);
			System.out.println(B);
			System.out.println(C);
		}
	
	Parent(int A, int B, String C)
	{
		this.A=A;
		this.B=B;
		this.C=C;
	}
	
}


class child extends Parent
{
	int num3=5;
	int A = 15;
	int B= 23;
	
	child(){
		super(0,0,"");
	}
	
	child(int K,int G,String F)
	{
		super(K,G,F);
		
	}
	
	void show()
	{
		System.out.println("Child");
		System.out.println(A);
		System.out.println(B);
		System.out.println(C);
	}
}










public class Inheritance1

{	
	public static void main(String[] args) 
	{
		Parent Pt = new Parent(6,4,"ABCD");
		child Ch = new child(2,5,"LLLL");
		
		System.out.println(Pt.getClass());
		
		System.out.println(Ch.getClass());
		//Pt.Display();
		//Ch.show();
		
		Parent pt1= new child(8,9,"abcdxyz");
		System.out.println(pt1.getClass());
		
		pt1.Display();
		
		
		
	}
}