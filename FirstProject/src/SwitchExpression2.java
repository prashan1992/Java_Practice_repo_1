
public class SwitchExpression2 {

	public static void main(String[] args) {
		DAYS D;
		D =DAYS.MONDAY;
		
		String daytpe=
		switch(D)
		{
		 	case MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY -> "This is working Day";
		 	case SATURDAY,SUNDAY -> "This is Weekend";
		};
	
		
		
		System.out.println(daytpe);
		

	}

	enum DAYS
	{
		MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY
	}
	
	
	
}
