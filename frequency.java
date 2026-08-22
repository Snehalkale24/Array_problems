// import java.util.*;
// public class frequency
// {
// 	public static void input(int arr[])
// 	{
// 		Scanner s=new Scanner(System.in);
// 		for(int i=0;i<arr.length;i++)
// 		{
// 			System.out.println("enter element:");
// 			arr[i]=s.nextInt();
// 		}
// 	}
// 	public static int frequency(int arr[],int key)
// 	{
// 		int count=0;
// 		for(int i=0;i<arr.length;i++)
// 		{
// 			if(arr[i]==key)
// 			{
// 				count++;
// 			}
// 		}
// 		return count;
// 	}
// 	public static void main(String args[])
// 	{
// 		Scanner s=new Scanner(System.in);
// 		System.out.println("enter array size:");
// 		int size=s.nextInt();

// 		int arr[]=new int[size];
// 		input(arr);
// 		System.out.println("find frequency:");
// 		int key=s.nextInt();

// 		int result=frequency(arr,key);
// 		System.out.println("frequency of"+key+" ="+result);
// 	}
// }

public class frequency{
	public static int Frequency(int arr[],int freq)
	{
		
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==freq)
			{
				count++;
			}
		}
		return count;
	}
	public static void main(String args[])
	{
		int arr[]={1,2,3,4,3,2,2};
		int freq=2;
		System.out.println(Frequency(arr,freq));
	}
}