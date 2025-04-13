
public class JavaString {

	public static void main(java.lang.String[] args) {
		
		String str1= "abckjhgsajkgfsfdsagasasjkafaadaasdhgjhsagjh";
		String str2 ="  nlkjh  ";
		
		System.out.println(str1+str2);
		
		String str3=str1.toUpperCase();
		System.out.println(str3+str2);
		String str4 = str3.substring(3,9);
		System.out.println(str4);
		
		System.out.println(	str1.indexOf("gkl"));
		System.out.println(	str2.length());
		String str5 = str2.trim();
		System.out.println(	str5.length());
		
		System.out.println(String.join(str5,str1));
		
	}

}
