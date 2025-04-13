package MyPack1;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx3 {
//Question: Develop a Java program that extracts all dates in the format dd/mm/yyyy from a given text.
	public static void main(String[] args) {
		
		String Str ="The event is scheduled for 15/03/2025. Another event is on 22/04/2025.";
		String StRegX = "\\b\\d{2}/\\d{2}/\\d{4}\\b";
		
		Pattern ptrn = Pattern.compile(StRegX);
		 Matcher matcher = ptrn.matcher(Str);
	//	
		List<String> dates = new ArrayList();
		
		while(matcher.find())
			dates.add(matcher.group());
		
		System.out.println(dates);
	}

}
