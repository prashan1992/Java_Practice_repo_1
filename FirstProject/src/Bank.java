import java.util.Calendar;
import java.util.Date;


public class Bank {

	int Deposit;
	int Withdrawl;
	int InitialBalance;
	String Name;
	String AccountNumber;
	Date Date =Calendar.getInstance().getTime();
	String ModeOftransaction;
	
	Bank(String N,String AcNo,int I,String MOT) 
	{	
		Name =N;
		AccountNumber =AcNo;
		InitialBalance = I;
		
		ModeOftransaction = MOT;
		
	}
	
	void	Deposit(int d)
	{
		InitialBalance=	InitialBalance+d;
		System.out.println(Date);
		System.out.println(ModeOftransaction);
		System.out.println("Transaction successful");
	}
	
	void	Withdrawl(int w)
	{
		
		if(w>InitialBalance)
		{
			InitialBalance = InitialBalance;
			System.out.println("Low Balance");
			System.out.println("Transaction Failed");
		}	
		else
		{
		InitialBalance=	InitialBalance-w;
		System.out.println(Date);
		System.out.println(ModeOftransaction);
		System.out.println("Transaction successful");
		}
	}
	
	void	DisplayStatement()
	{
		System.out.println(Date);
		System.out.println("Account Holder Name :"+Name);
		System.out.println("Account Holder Name :"+AccountNumber);
		System.out.println("Initial Balance :"+InitialBalance);
		System.out.println("Remaining Balance :"+InitialBalance);
	}
}
