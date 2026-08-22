import java.util.*;
public class longestword
{
	public static String longest(String str)
	{
		String word[]=str.split(" ");
		String longest=" ";

		for(int i=0;i<word.length;i++)
		{
			if(word[i].length()> longest.length())
			{
				longest=word[i];
			}
		}
		return longest;
	}

	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter a sentece:");
		String str=s.nextLine();

		String result=longest(str);
		System.out.println("longest word:"+result);
		
	}
}