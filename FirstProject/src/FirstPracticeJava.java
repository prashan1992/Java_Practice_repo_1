
public class FirstPracticeJava {
	
	
	public static void main(String[] args) {
		
		/*int n1 = 10;
		short s1 = 12;
		char c1 = 'k';
		float f1 = 9.81f;
		long L1 = 9876544l;
		String S1 = "Hellow World";
		//Hellow World 
		System.out.print(S1);
		System.out.print(n1);
		System.out.print(c1);
		
		Variable Declaration and storing Values
		s1 = n1;
		n1= s1;
		n1= L1;
		L1= n1;
		S1 = f1;
		f1= S1;
		
	int a = 32;	
	int b = 19;
	
	int c = a;
	 a=b;
	 b= c;
	 
	System.out.println(a);	
	System.out.println(b);
	
	
		
		int a = 32;	
		int b = 17;
		
		a=a+b;
		b= a-b;
		
		a=a-b;
		
		
		
		System.out.println(a);	
		System.out.println(b);
		
		int P = 1122334445;
		int R = 12;
		int T= 6;
		
		int K= P*R*T/100;
		System.out.println(K);
		
		int J = P*(1 + R/100)^T;
		System.out.println(J);
		
				int Y= 1992;
				if (Y%100 == 0 && Y%400 == 0)
					System.out.println("This year is a leap year");
				else if(Y%4 == 0)
				System.out.println("This year is a leap year");
				else
					System.out.println("This year is not a leap year");
						
		//Even-Odd Condition		
				if (Y%2==0)
					System.out.println("Y is even number");
				else 
					System.out.println("Y is odd number");
			// Age to vote		
				if (a>=18)
					System.out.println("He/she is eligible to vote");
				else 
					System.out.println("He/she is not eligible to vote");
				
  int M= R;
  
  if (P>M)	  
  
    M=P;
 
  
  else if (T>M) 
  
  M= T;
 
  System.out.println(M);
	
		  
	//Perimeter and Area			
  int l = 10;
  int B= 6;
  
  int p = 2*(l+B);
  int A = l*B;
  
  System.out.println(p);
  System.out.println(A);
  
  //Triangle Validity
  int a1=60;
  int a2=60;
  int a3=60;
  
  if (a1+a2+a3==180)
	  System.out.println("This is a valid triangle");
  else 		
	  System.out.println("This is a not valid triangle");
  
  int H=45;
  float C=0.8f;
  int Tn = 5300;
  
  if(H>50 && C<0.7 && Tn>5600)
	  System.out.println("Grade of this steel is 10");
  else if (H>50 && C<0.7 && Tn<5600)
	  System.out.println("Grade of this steel is 9");
  else if(H<50 && C<0.7 && Tn>5600)
	  System.out.println("Grade of this steel is 8");
  else if (H>50 && C>0.7 && Tn>5600)
  	  System.out.println("Grade of this steel is 7");
  else if (H>50 || C<0.7 || Tn>5600)
	  System.out.println("Grade of this steel is 6");
  else
	  System.out.println("Grade of this steel is 5"); 
  
  //Library charges
  int D = 32;
  
  if (D<=5)
	  System.out.println("You have to pay fine 50 paise only.");
  else if (D>5 && D<=10)
	  System.out.println("You have to pay fine 1 rupee only.");
  else if (D>10 && D<30)
	  System.out.println("You have to pay fine 5 rupee only.");
  else
	  System.out.println("Your membership has been cancelled");
  */
  //Grading 
		
		int Mm=100;
		int Mo= 85;
		
		int Hm=120;
		int Ho= 102;
		
		int Em=150;
		int Eo= 105;
		
		int Sm=120; 
		int So= 103;
		
		int Dm= 100;
		int Do= 95;
		
		float Tm= Mm+Hm+Em+Sm+Dm ;
		float To = Mo+Ho+Eo+So+Do;
		
		float P = (To/Tm)*100;
		System.out.println(P);
		
		
	if (P>=90)	
		System.out.println("A Grade");
	else if (P>=80 )
		System.out.println("B Grade");
	else if (P>=60)
		System.out.println("C Grade");
		
	

	
	}
}
	


		
	
