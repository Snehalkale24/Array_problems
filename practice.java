import java.util.*;
public class practice
{
	public static String sort(String str)
	{
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length-1;i++)
		{
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]>ch[j])
				{
					char temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
		}
		return new String(ch);
	}
	public static void main(String args[])
	{
		String str="snehal";
		System.out.println(sort(str));
	}
}