import java.util.Calendar;
import java.util.Date;

public class NestedClass 
{
	String sName;
	InnerClass inc;
	
	NestedClass(String sname)
	{
		this.sName=sname;
		inc=new InnerClass(sname);
	}
	
	void setName(String sName)
	{
		this.sName=sName;
	}

	void print()
	{
		System.out.println(this.sName);
		
		System.out.println("***From Inner Class**********");
		System.out.println(this.inc.tDate);
		System.out.println(this.inc.getName());
		
	}

	private class InnerClass{
		private String sInnerName;
		Date tDate;
		
		InnerClass(String sname)
		{
			this.sInnerName=sname;
			tDate= Calendar.getInstance().getTime();
		}
		
		
		String getName()
		{
			return sInnerName;
		}
	
		
}
	
	
}
