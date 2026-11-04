// import java.util.*;
// public class sorted{
// 	public static void input(int arr[])
// 	{
// 		Scanner s=new Scanner(System.in);
// 		for(int i=0;i<arr.length;i++)
// 		{
// 			System.out.println("enter element:");
// 			arr[i]=s.nextInt();
// 		}
// 	}
// 	public static Boolean sort(int arr[])
// 	{
// 		for(int i=0;i<arr.length-1;i++)
// 		{
// 			if(arr[i]>arr[i+1])
// 			{
// 				return false;
// 			}
// 		}
// 		return true;
// 	}
// 	public static void main(String args[])
// 	{
// 		Scanner s=new Scanner(System.in);
// 		System.out.println("Enter array size:");
// 		int size=s.nextInt();

// 		int arr[]=new int[size];
// 		input(arr);
// 		sort(arr);
// 		if(sort(arr))
// 		{
// 			System.out.println("array is sorted in ascending order:");
// 		}
// 		else{
// 			System.out.println("Array IS NOT sorted in ascending order");
// 		}

// 	}
// }

public class sorted{
	public static boolean sort(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>arr[i+1])
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String args[])
	{
		int arr[]={12,3,4,5,3};
		System.out.println(sort(arr));
	}
}