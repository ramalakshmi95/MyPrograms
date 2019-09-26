package folder;

public class PrintTriangle 
{
	public static void main(String[] args) 
	{
		//printValues();
		printValuesWithSpace();
	}
	public static void printValues()
	{
		int value=1,maxrow=5;
		for(int i=1;i<=maxrow;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(value+"\t");	
				value=value+2;
			}
		System.out.println("");
		}
	}
	
	public static void printValuesWithSpace()
	{
		int value=1,maxrow=3;
		for(int i=1;i<=maxrow;i++)
		{	
			for(int k=1;k<=maxrow-i;k++)
				System.out.print("\t");
			for(int j=1;j<=i;j++)
			{
				System.out.print(value+"\t\t");	
				value=value+2;
			}
		System.out.println("");
		}
	}

}
