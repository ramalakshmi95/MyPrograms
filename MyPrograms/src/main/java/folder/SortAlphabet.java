
package folder;

import java.util.ArrayList;
import java.util.List;

//AMazon interview question
public class SortAlphabet 
{
	public static void main(String[] args) 
	{
		String input="BcaDbdAC";
		int i=0,position;
		String output="";
		char[] inputCharArray = input.toCharArray();
		List<Character> sort =new ArrayList<Character>();
		for(int j=0;j<inputCharArray.length;j++)
		{
			Character valueOf = Character.valueOf(inputCharArray[j]);
			sort.add(valueOf);
		}
		while(i<sort.size())
		{
			char a=sort.get(i);
			if(Character.isUpperCase(a)) 
				a=Character.toLowerCase(a);
			else
				a=Character.toUpperCase(a);
			for(int j=i+1;j<sort.size();j++)
			{
				char b=sort.get(j);
				if(a==b)
				{
					sort.remove(j);
					sort.add(i+1,b);
					break;
				}		
			}
			i=i+1;
			//i=i+2;
		}
		for(Character ch:sort)
		{
			//System.out.print(ch);
			output=output+ch;
		}
		System.out.println(output);
		}
	
}
