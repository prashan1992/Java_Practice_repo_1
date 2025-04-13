package MyPack1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Question: Write a Java program that replaces multiple consecutive spaces in a string with a single space.
public class RegEx4 {

	public static void main(String[] args) {
		 String text = "This  is   a    test   string.";
		 Pattern ptrn = Pattern.compile("\\s+");
		 Matcher matcher = ptrn.matcher(text);
		 
	String result =	matcher.replaceAll(" ");
		 System.out.println(result);
	}

}
