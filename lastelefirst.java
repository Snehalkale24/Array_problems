import java.util.*;
public class lastelefirst
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
	public static void shiftlasttofirst(int arr[])
	{
		int temp=arr[arr.length-1];

		for(int i=arr.length-1;i>0;i--)
			arr[i]=arr[i-1];

		arr[0]=temp;
	}

	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter size of an array:");
		int size=s.nextInt();

		int arr[]=new int[size];
		input(arr);
		shiftlasttofirst(arr);

		for (int i=0;i<arr.length;i++)
			System.out.println("array: "+ arr[i]+ " ");

	}
}