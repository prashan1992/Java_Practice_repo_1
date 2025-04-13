
public class NestedClassPractice {

	
	String Name;
	String EmplyeeID ;
	String Department;
	String RM ;
	float rating ;
	float exp ;
	float Package;
	
	
	class ShowIntroDuction
	{	
		
		
		 ShowIntroDuction(String N,String E,String D,String R,float rng,float Ex,float Pkg)
		{
			 Name =N;
			 EmplyeeID=E;
			 Department = D;
			 RM=R;
			 rating = rng;
			 exp = Ex;
			 Package = Pkg;
		}
		void ShowName()
		{
			System.out.println(Name);
		}
		void ShowEmployeeID()
		{
			System.out.println(EmplyeeID);
		}
		
		void ShowDepartment()
		{
			System.out.println(Department);
		}
		
		void ShowRM()
		{
			System.out.println(RM);
		}
		
			void ShowExp()
		{
			System.out.println(exp);
		}
		
			void rating()
		{
		System.out.println(rating);
		}
		void Package()
		{
		System.out.println(Package);
		}
	
		}
	}
	
	

