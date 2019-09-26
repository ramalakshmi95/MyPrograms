package folder;

public class FactorialWithoutLoop 
{
	public static void main(String[] args) 
	{
		int ans=1;
		factorial(5,ans);
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
}
