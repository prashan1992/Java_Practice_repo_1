package MyPack1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
//5. **Validate IP Addresses**: Create a Java program that validates IP addresses. The program should check if the IP address is in the correct format (e.g., 192.168.1.1).
public class RegEx5 {

	public static void main(String[] args) {
   String ip = "192.168.1.1";	
   String RegEx = "^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";

   	
   
   Pattern ptrn = Pattern.compile(RegEx);
   Matcher matcher = ptrn.matcher(ip);
   if(matcher.find())
	   System.out.println("This is a Valid ip address.");
   else
	   System.out.println("This is a NOT Valid ip address.");
	}

}
