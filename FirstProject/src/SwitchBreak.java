
public class SwitchBreak {
	public static void main(JavaString[] args) {
		
		 int N1=10;
		 int N2=21;
		 System.out.println("1. Add");
		 System.out.println("2. Substact");
		 System.out.println("3. Multiply");
		 System.out.println("4. Divide");
		 System.out.println("Enter your choice");
		 char ch='K';
		 
		 switch (ch)
		 {
		 case '1':
		 case 'A':
		  System.out.println(N1+N2);
		 
		 case '2':
		 case 'B':	 
			 System.out.println(N1-N2);
			 break;
		 case '3':	 
		 case 'C':	 
			 System.out.println(N1*N2);
			 break;
		 case '4':	 
		 case 'D': 
			 System.out.println(N1/N2);
			 break;
		default :	 
			 System.out.println("Please Enter Valid Oparator");
		 }
		
	//Function for vowel	 
		 switch (ch)
		 {
		 
		 case 'A':	 
			
		
		 case 'E':	 
			
		 case 'I':	 
				
		 case 'O':	 
				
		 case 'U':	 
			 System.out.println("is a vowel");
			 break;	
		 default :	 
			 System.out.println("is not a vowel");
		 }	 
	/*	
		 JavaString max = N1>N2?"N1":"N2" ;
		
		 System.out.println(max+ " is greater");
		 
			 
		 

			JavaString D = "4"; 
			
			switch (D) 
			{
			case "1":
				 System.out.println("Monday");
				 break;	
			case "2":
				 System.out.println("Tuesday");
				 break;	
			case "3":
				 System.out.println("Wednesday");
				 break;	
			case "4":
				 System.out.println("Thursday");
				 break;	
			case "5":
				 System.out.println("Friday");
				 break;	
			case "6":
				 System.out.println("Saturday");
				 break;	
			case "7":
				 System.out.println("Sunday");
				 break;	
			 default :	 
				 System.out.println("Please type correct day index");
			
			}
		*/
	}

}
