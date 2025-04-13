package MyPack1;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx2 {
	//Problem: Create a regex pattern that matches a US phone number in the following format:

	//	(XXX) XXX-XXXX where X is any digit.
	//	Example input: (123) 456-7890 — should match.
	//	Example input: 123-456-7890 — should not match.
		//Example input: (12) 345-6789 — should not match.
	
	public static void main(String[] args) {
		
		String ptrn = "^\\(\\d{3}\\) \\d{3}-\\d{4}$";
		String Str = "(123) 456-7890";
		//Matcher match = ptrn.matcher(Str);
		
		System.out.println(Str.matches(ptrn));
	}

}
