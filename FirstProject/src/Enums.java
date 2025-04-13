
public class Enums {

	public static void main(String[] args) {
		
		/*for(Day d:Day.values() )
			System.out.println(d);*/
		
		//System.out.println(Day.valueOf("MONDAY"));
		//System.out.println(Day.va);
		
		Object []obj=Day.values();
		for(int i=0;i<7;i++)
			System.out.println(obj[i]);
		
		
		Day d=Day.TUESDAY;
		
		switch (d)
		{
		case SUNDAY:
			System.out.println("Its Sunday");
		break;
		case MONDAY:
		System.out.println("Its Monday");
		break;
		case TUESDAY:
			System.out.println("Its Tuesday");
			break;	
		case WEDNESDAY:	
			System.out.println("Its Wednesday");
			break;	
		case THURSDAY:	
			System.out.println("Its Thursday");
			break;	
		case FRIDAY:	
			System.out.println("Its Friday");
			break;	
		case SATURDAY:	
			System.out.println("Its Saturday");
			break;		
		
	}
		

		int dn=Day.SUNDAY.getValue();
		String str1= Day.SUNDAY.getValues();
		System.out.println(str1);
		
	//	Day d1 =new Day(5);
	}

	

	
}


 enum Day {
	
	SUNDAY(1,"Weekend"), MONDAY(2),TUESDAY(3),WEDNESDAY(4),THURSDAY(5),FRIDAY(6),SATURDAY(7);
	int dayNum;
	String msg;
		Day(int val)
		{
			this.dayNum=val;
		}
		
		Day(int val,String msg)
		{
			this.dayNum=val;
			this.msg=msg;
		}
		
		int getValue()
		{
			return dayNum;
		}	
		
		String getValues()
		{
			String s1= dayNum + "\n" + this.msg; 
			return s1;
	}
}
