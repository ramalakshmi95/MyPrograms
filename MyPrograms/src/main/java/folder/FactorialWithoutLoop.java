package folder;

public class FactorialWithoutLoop 
{
	public static void main(String[] args) 
	{
		int ans=1;
		factorial(5,ans);
		System.out.println(fact(5));
	}
	public static void factorial(int n,int ans)
	{
		if(n==1)
			System.out.println(ans);
		else
			{
				ans=ans*n;
				factorial(n-1,ans);
			}
		
	}
	
	public static int fact(int n)
	{
		if(n==1)
			return 1;
		return n*(fact(n-1));
	}
}
