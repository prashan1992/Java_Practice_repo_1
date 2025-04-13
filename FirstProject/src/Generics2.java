
public class Generics2 {

	public static void main(String[] args) {
		
		Gentype<Integer,String> GT1 = new Gentype<Integer,String>(6," New Generic");
		

	}
	
}	
	
	class Gentype<T1,T2>
	{
		T1 t1;
		T2 t2;
		
	public	Gentype(T1 k,T2 m)
		{
			t1=k;
			t2=m;
		}
		
	}


