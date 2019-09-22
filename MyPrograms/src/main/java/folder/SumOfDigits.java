package folder;

public class SumOfDigits 
{
	public static void main(String[] args) 
	{
		int input=12345;
		SumOfDigits s=new SumOfDigits();

		System.out.println(s.SumOfDigitsUsingCharArray(input));
		System.out.println(s.SumOfDigitsUsingWhile(input));
	}
	
	public int SumOfDigitsUsingCharArray(int input)
	{
		int sum=0;
		String NumAsString=String.valueOf(input);
		char[] digits=NumAsString.toCharArray();
		for(char n:digits)
			sum=sum+Character.getNumericValue(n);
		//int parseInt = Integer.parseInt(""+n);
				//char 1--> ascii 49
		return sum;		
	}
	
	public int SumOfDigitsUsingWhile(int input)
	{
		int sum=0;
		while(input>0)
		{
			int rem=input%10;
			sum=sum+rem;
			input=input/10;
		}
		return sum;
	}
}
