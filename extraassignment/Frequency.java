import java.util.*;
public class Frequency
{
	public static void input(int arr[])
	{
		Scanner s=new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("enter element:");
			arr[i]=s.nextInt();
		}
	}
	public static void Frequency(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			int count=1;
			boolean found=false;
			for(int j=0;j<i;j++)
			{
				if(arr[i]==arr[j])
				{
					found=true;
					break;
				}
			}
			if(found)
				continue;

			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
			}
			System.out.println(arr[i]+"->"+count);

		}
	}

	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter sixe")
	}
}