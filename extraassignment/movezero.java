import java.util.*;
public class movezero
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
	public static void movezero(int arr[])
	{
		int index=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				arr[index]=arr[i];
				index++;
			}
		}
		while(index<arr.length)
		{
			arr[index]=0;
			index++;
		}
	}
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter size:");
		int size=s.nextInt();

		int arr[]=new int[size];
		input(arr);
		movezero(arr);

		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
		}
	}
}