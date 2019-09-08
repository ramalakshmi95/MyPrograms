package folder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicates
{
	public static void main(String[] args) 
	{
		int[] arr= {10,20,10,30,50,20,60,60};
		RemoveDuplicates rd=new RemoveDuplicates();
		rd.findDuplicates1(arr);
		rd.findDuplicatesAfterSort(arr);
		rd.findDuplicatesUsingSet(arr);
	}
	public void findDuplicates1(int[] arr)
	{
		//using normal for loops
		boolean duplicate;
		List<Integer> unique=new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++)
		{
			duplicate=false;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					duplicate=true;
					break;
				}
			}
			if(!duplicate)
				unique.add(arr[i]);
		}
		System.out.println(unique);
	}
	
	public void findDuplicatesAfterSort(int[] arr)
	{
		//find duplicates by sorting array using collections
		List<Integer> list=new ArrayList<Integer>();
		List<Integer> unique=new ArrayList<Integer>();
		for(int a:arr)
		{
			list.add(Integer.valueOf(a));
		}
		Collections.sort(list);
		for(int i=0;i<list.size();i++)
		{
			if(i==list.size()-1) 
			{
				unique.add(list.get(i));
			}
			else if(list.get(i)!=list.get(i+1))
			{				
				unique.add(list.get(i));
			}
		}
		System.out.println(unique);
	}
	public void findDuplicatesUsingSet(int[] arr)
	{
		List<Integer> list=new ArrayList<Integer>();
		for(int a:arr)
		{
			list.add(Integer.valueOf(a));
		}
		Set<Integer> unique=new HashSet<Integer>(list);
		System.out.println(unique);
	}
}
