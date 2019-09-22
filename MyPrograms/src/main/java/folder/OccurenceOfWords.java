package folder;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class OccurenceOfWords 
{

	public static void main(String[] args) 
	{
		OccurenceOfWords o=new OccurenceOfWords();
		String sentence="This is my sentence.This is is the sentence";
		String StringToFind="is";
		//String[] words= sentence.split(" ");
		String[] words= sentence.split("\\W");
		o.getOccurenceUsingMap(words);
		o.getOccurenceWithoutMap(words, StringToFind);
	}
	
	public void getOccurenceWithoutMap(String[] words,String StringToFind)
	{
		int count=0;
		for(String str:words)
		{
			if(str.equalsIgnoreCase(StringToFind))
				count++;
		}
		System.out.println(count);
	}
	
	public void getOccurenceUsingMap(String[] words)
	{
		Map<String,Integer> count= new HashMap<String,Integer>();
		for(int i=0;i<words.length;i++)
		{
			if(count.containsKey(words[i]))
			{
				int val=count.get(words[i]);
				count.put(words[i], val+1);
			}
			else
				count.put(words[i], 1);
		}
		/*for(Entry<String,Integer> disp:count.entrySet())
		{
			System.out.println(disp.getKey());
			System.out.println(disp.getValue());
			
		}*/
	}
}
