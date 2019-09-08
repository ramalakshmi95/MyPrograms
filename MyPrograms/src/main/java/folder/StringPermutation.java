package folder;

import java.util.HashSet;
import java.util.Set;

public class StringPermutation {
	
	// Function to print all the permutations of str 
	static void printPermutn(String str, String ans, Set<String> perm) 
	{ 
		int len=str.length();
		if (len == 0) { 
			boolean add = perm.add(ans);
            System.out.println(ans + " ");
            return; 
        } 
		for (int i = 0; i < len; i++) 
		{
			//System.out.println("ans:"+ans);
			// ith character of str 
			char ch = str.charAt(i); 
			// Rest of the string after excluding  
			// the ith character 
			String ros = str.substring(0, i) +  str.substring(i + 1); 
			// Recurvise call
			printPermutn(ros, ans+ch,perm); 	
			} 
	    } 
	  
	    public static void main(String[] args) 
	    { 
	    	Set<String> perm=new HashSet<String>();
	        String s = "abad"; 
	        printPermutn(s, "",perm); 
	       System.out.println( perm.size());
	    } 
}
