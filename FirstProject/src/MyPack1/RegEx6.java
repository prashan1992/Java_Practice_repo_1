package MyPack1;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//6. **Extract Hashtags**: Develop a Java program that extracts all hashtags (words starting with '#') from a given text.

public class RegEx6 {

	public static void main(String[] args) {
		String Str = "Together we rise, side by side,Strength in #unity, we won't divide.#TeamworkMakes TheDreamWork #WinningTogether #ProudMoment";
				 
		String RegEx = "#\\w+";
		Pattern ptrn = Pattern.compile(RegEx);
		Matcher matcher = ptrn.matcher(Str);
		
		List<String> hashTags = new ArrayList();
		while(matcher.find())
			hashTags.add(matcher.group());
		
		 System.out.println(hashTags);
	}




public List<String> keyWords(String Str)
{
	String RegEx = "#\\w+";
	Pattern ptrn = Pattern.compile(RegEx);
	Matcher matcher = ptrn.matcher(Str);
	
	List<String> hashTags = new ArrayList();
	while(matcher.find())
		hashTags.add(matcher.group());
	
	 System.out.println(hashTags);
	
	
	return hashTags;
	
}


}