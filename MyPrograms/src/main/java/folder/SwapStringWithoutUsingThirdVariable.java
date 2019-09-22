package folder;

public class SwapStringWithoutUsingThirdVariable 
{
	public static void main(String[] args) 
	{
		String str1="Hai";
		String str2="Hello";
		int str1length = str1.length();
		
		str1=str1.concat(str2);
		str2=str1.substring(0,str1length);
		str1=str1.substring(str1length);
		
		System.out.println(str1);
		System.out.println(str2);
		
	}
}
