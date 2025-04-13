package MyPack1;

public class Genrics1 {

	public static void main(String[] args) {
		myclass<Integer> obj1=new myclass<Integer>(6);
		System.out.println( obj1.getValue());
		
		myclass<String> obj2=new myclass<String>("Hello");

		obj2.getValue();
	
		
		myType<Integer, String> mt1= new myType<Integer, String>(6,"Hello");
		myType<Integer, Boolean> mt2= new myType<Integer, Boolean>(6,true);
		
	}
	
}

class myclass<T>
{
	T var1;
	public myclass(T t1)
	{
		var1=t1;
	}
	
	T getValue()
	{
		return var1;
	}
	
}


class myType<T1,T2>
{
	T1 t1;
	T2 t2;
	public myType(T1 t1, T2 t2)
	{
		this.t1=t1;
		this.t2=t2;
				
		
}

	T1 getValue1()
	{
		return t1;
	}
	
	T2 getValue2()
	{
		return t2;
	}
}