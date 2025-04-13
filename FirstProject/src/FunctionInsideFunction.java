import java.util.Scanner;

public class FunctionInsideFunction {

	public static void main(String[] args) {
		
		MyMenu1 m1= new MyMenu1();
		//m1.oparationDisplayMenu();
	
			m1.Multiply(23, 5);

			//Test1 
			
	}
	void msg()
	{
	 System.out.println("hello");	
	}

		
	
}

class MyMenu
{
	FunctionInsideFunction f1=new FunctionInsideFunction();
	void oparationDisplayMenu()
	{
		f1.msg();
		
		Scanner obj = new Scanner(System.in);
		Scanner obj2 = new Scanner(System.in);
		Scanner obj3 = new Scanner(System.in);
		int  Choice;  
		
		do
		{
	      System.out.println("1.Add");
	      System.out.println("2.Substarct");
	      System.out.println("3.Multiply");
	      System.out.println("4.Prime");
	      System.out.println("5.Exit");
	      System.out.println("Please Enter Your Choice:" );
	      Choice=obj.nextInt();
	  	
	      switch (Choice)
	      {
	      case 1:
	    	  int N1 = obj2.nextInt();
		  		int N2 =obj3.nextInt();
	    	  Add(N1,N2); 
	    	  break;
	    	  
	      case 2:
	    	  int N3 = obj2.nextInt();
		  		int N4 =obj3.nextInt();
	    	
	    	  Sub(N3,N4); 
	    	  break;
	    	  
	      case 3:
	    	  int N5 = obj2.nextInt();
		  		int N6 =obj3.nextInt();
	    	
	    	  Multiply(N5,N6); 
	    	  break;
	    
	      case 4:
	    	  int N7 = obj2.nextInt();
		  		
	    	
	    	  Prime(N7); 
	    	  break;
	    
	      case 5:
	    	  Exit(); 
	    	  break;
	      
	      default :	 
				 System.out.println("Please Enter a valid choice");  
	      }
		}while(Choice<5);
		    
	}
	
	void Add(int N1,int N2) 
	{
	 System.out.println(N1+N2);
	}
	
	void Sub (int N1,int N2) 
	{
	 System.out.println(N1-N2);
	}
	
	void Multiply (int N1,int N2) 
	{
	 System.out.println(N1*N2);
	}
	
	void Prime (int N1) 
	{
	 
		
		
	}
	
	void Exit () 
	{
		 System.out.println("Exit");
	}

	
}
