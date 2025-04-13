
public class TestClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

					
		Employee E = new Employee(7695,"Shagun","Sharma",'M');
		E.ShowEmployee();
		
		Employee E2=new Employee(E);
		E2.ShowEmployee();
		
		
		Employee E3;
		E3=E;
		E3.ShowEmployee();
		
		
	
		
	//String FName =		E.getFirstName();
		//	System.out.print(FName);
			//E.setFirstName("Rahul");
		//	E.ShowEmployee();
           // E.setFullName();
           // E.ShowEmployee();
            
            
            //Employee e1= new Employee();
            //e1.ShowEmployee();
            
            //e1=E;
            //e1.ShowEmployee();
            
            //e1.setFirstName("Hello");
            
          //  e1.ShowEmployee();
            //E.ShowEmployee();
		
		Rectangle rectangle = new Rectangle(2,3);
		
		rectangle.AriaOfRectangle();
		rectangle.PerimeterOfRectangle();
		
				
		
		Bank bank = new Bank("Ramesh","59000104581",30000,"Cheque");
		bank.Deposit(2000);
		bank.Withdrawl(14000);
		bank.DisplayStatement();
		bank.Deposit(20000);
		bank.Withdrawl(90000);
		bank.DisplayStatement();
		bank.Deposit(2000);
		bank.Withdrawl(90);
		bank.DisplayStatement();
		
		System.out.println("");	
		System.out.println("");
		System.out.println("");
		
		
		
		
		Triangle triangle = new Triangle(5,7,9);
		
		float A = triangle.getArea();
		System.out.println(A);
		
		System.out.println("");
		float P = triangle.getPerimeter();
		System.out.println(P);
		
		shapes3D s3d ;
		Cyllinder cyllinder = new Cyllinder(8);
		
		s3d=cyllinder;
		
		float v = cyllinder.getVolume();
		System.out.println(v);
		 
		
		Cone cone = new Cone(6,4);
		s3d=cone;
		float V = cone.getVolume();
		System.out.println(V);
			
		
	}

}
