package MyPack1;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx1 {
//Problem: Write a regex that matches a string if it starts with "hello" and ends with "world".
	public static void main(String[] args) {
		Pattern ptrn1 =  Pattern.compile("^hello.*world$");
		//Pattern ptrn2 =  Pattern.compile("world$");
		Matcher match1 =  ptrn1.matcher("hello this is Java world");
	//	Matcher match2 =  ptrn2.matcher("Hello this is Java world");
		
		System.out.println(match1.find());
	//	System.out.println(match2.find());
		
		
	}

}
