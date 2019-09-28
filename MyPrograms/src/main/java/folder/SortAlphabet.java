
package folder;

import java.util.ArrayList;
import java.util.List;

//AMazon interview question
public class SortAlphabet 
{
	public static void main(String[] args) 
	{
		String input="BcaDbdAC",output="";
		int i=0;
		char[] inputCharArray = input.toCharArray();
		List<Character> inputList =new ArrayList<Character>();
		for(int j=0;j<inputCharArray.length;j++)
		{
			Character valueOf = Character.valueOf(inputCharArray[j]);
			inputList.add(valueOf);
		}
		while(i<inputList.size())
		{
			char a=inputList.get(i);
			if(Character.isUpperCase(a)) 
				a=Character.toLowerCase(a);
			else
				a=Character.toUpperCase(a);
			for(int j=i+1;j<inputList.size();j++)
			{
				char b=inputList.get(j);
				if(a==b)
				{
					inputList.remove(j);
					inputList.add(i+1,b);
					break;
				}		
			}
			i=i+1;
			//i=i+2;
		}
		for(Character ch:inputList)
		{
			//System.out.print(ch);
			output=output+ch;
		}
		System.out.println(output);
		}
}
