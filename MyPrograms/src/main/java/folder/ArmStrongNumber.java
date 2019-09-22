package folder;

public class ArmStrongNumber 
{
	////An Armstrong number is an integer such that the sum of the cubes of its digits is equal to the number itself. 
	// For example, 371 is an Armstrong number since 3**3 + 7**3 + 1**3 = 371
	
	public static void main(String[] args) 
	{
		int originalNumber=371,sum=0,rem,cube;
		int num=originalNumber;
		while(num>0)
		{
			rem=num%10;
			cube=rem*rem*rem;
			sum+=cube;
			num=num/10;
		}
		if(originalNumber == sum)
			System.out.println("Armstrong number");
		else
			System.out.println("Not an armstrong number");
	}
}
