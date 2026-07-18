import java.util.*;
public class forwbackw
{
	public static void  input(int arr[])
	{
		Scanner s=new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("enter element:");
			arr[i]=s.nextInt();
		}
	}
	public static void forward(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+ " ");
		}
		System.out.println();
	}
	public static void backword(int arr[])
	{
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]+ " ");
		}
		System.out.println();
	}
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter size:");
		int size=s.nextInt();


		int arr[]=new int[size];
		input(arr);
		System.out.println("Display Array : Forward");
		forward(arr);
		System.out.println("Display Array : backward");
		backword(arr);
	}}