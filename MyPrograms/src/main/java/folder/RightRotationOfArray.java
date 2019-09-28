package folder;

import java.util.ArrayList;
import java.util.List;

public class RightRotationOfArray 
{
	public static void main(String[] args) 
	{
		int[] input= {3,5,6,7,8,36,55,78};
		int n =4;
		List<Integer> inputList=new ArrayList<Integer>();
		for(int i=0;i<input.length;i++)
			inputList.add(Integer.valueOf(input[i]));
		for(int j =1;j<=n;j++)
		{
			int a=inputList.get(inputList.size()-1);
			inputList.remove(inputList.size()-1);
			inputList.add(0,a);
		}
		System.out.println(inputList);
	}
}
