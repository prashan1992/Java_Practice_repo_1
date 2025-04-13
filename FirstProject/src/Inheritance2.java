

abstract class Base
{
	
	abstract void method1();
	
	void ParentClass()
	{
	System.out.println("Parent Class");
	}
	 void Similar()
	{
	System.out.println("Similar Base Class");
	}
	
	
}

class Child1 extends Base
{
	void method1()
	{
		
	}
	
	void ChildClass1()
	{
	System.out.println("Child Class");
	}
	void Similar()
	{
	System.out.println("Similar Child Class");
//	System.out.println(S);
	}
	
	
}





public class Inheritance2 {

	
	
	
	
	
	public static void main(String[] args) {
		
		//Base base = new Base();
		Child1 Child = new Child1();
		Base B2 =Child ;
		
		//base.Similar();
		Child.Similar();

		
		B2.Similar();
		
	}

}
