package folder;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CountOfCharactersUsingMap 
{
	public static void main(String[] args) 
	{	
		String str="Welcome";
		Map<Character,Integer> count= new HashMap<Character,Integer>();
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(count.containsKey(ch))
			{
				int value=count.get(ch);
				count.put(ch, value+1);
			}
			else
				count.put(ch,1);
		}
		//Set<Entry<Character, Integer>> entrySet = count.entrySet();
		for(Entry<Character,Integer> entry: count.entrySet())
		{
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		System.out.println(count.keySet());//returns keys
		System.out.println(count.values());//returns values
	}
}