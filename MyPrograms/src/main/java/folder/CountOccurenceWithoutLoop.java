package folder;

public class CountOccurenceWithoutLoop 
{
	public static void main(String[] args) 
	{
		String sentence="This is my sentence.This is the this sentence";
		String stringToFind="is";
		sentence=sentence.toLowerCase();
		int fullLength=sentence.length();
		String newSentence=sentence.replaceAll(stringToFind, "");
		int newLength=newSentence.length();
		int occ=fullLength-newLength;
		System.out.println(occ/stringToFind.length());
	}
}
