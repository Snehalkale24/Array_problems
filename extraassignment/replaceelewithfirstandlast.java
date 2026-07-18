import java.util.*;
public class replaceelewithfirstandlast
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
	public static void replace(int arr[])
	{
		
		for(int i=0;i<arr.length;i++)
		{ 
			int first=arr[i];
		int last=arr[i]%10; 
		while(first >= 10)
		{
			first= first/10;
		}

		arr[i]=first*10+last;

		}
	}
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter size:");
		int size=s.nextInt();

		int arr[]=new int[size];
		input(arr);

		replace(arr);


		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
}