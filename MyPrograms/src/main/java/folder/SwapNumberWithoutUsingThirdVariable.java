package folder;

public class SwapNumberWithoutUsingThirdVariable 
{
	public static void main(String[] args) 
	{
		int x=5,y=10;
		x=x+y;
		y=x-y;
		x=x-y;
		
		/*x=x*y;
		y=x/y;
		x=x/y;*/
		
		System.out.println(x);
		System.out.println(y);
	}
	
}
