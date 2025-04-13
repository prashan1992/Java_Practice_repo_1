
public class Enum2 {

	public static void main(String[] args) {
		
		for(months m:months.values())
		{
		System.out.println(m);
		}
		
		System.out.println(months.APRIL.getVals());
		
		System.out.println(months.valueOf("FEBRUARY"));
		Object x=months.values()[0];
		
		/*for(int y=0;y<=11;y++)
		{
			Object z=months.values()[y];
		System.out.println(z);
		}*/
		
		String str1=getMonthName(12);
		System.out.println(str1);
		
		
	}

	static String getMonthName(int val)
	{
		String mname="Invalid Month";
		for(months m:months.values())
			{
				if (m.getVals()==val)
					mname=m.name();
			}
		return mname;
	}
	


}


enum months
{
	JANUARY(1),FEBRUARY(2),MARCH(3),APRIL(4),MAY(5),JUNE(6),JULY(7),AUGAUST(8),SEPTEMBER(9),OCTOBER(10),NOVEMBER(11),DECEMBER(12);

	int val;
	months(int n)
	{
		val =n;
	}
	
	int getVals()
	{
		return val;
	}
	
}

