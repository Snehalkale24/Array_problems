import java.util.*;
public class practice
{
	public static void  shift(String str)
	{
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch=='a'|| ch=='i'||ch=='u'||ch=='e')
			{
				count++;
				System.out.print(count);
			}
			else{
               System.out.print(ch);
			}
		}
		
	}
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("enter string:");
		String str=s.nextLine();

		shift(str);
	}
}

