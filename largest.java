// public class largest{
// 	public static int largest(int arr[])
// 	{
// 		int max=arr[0];
// 		for(int i=1;i<arr.length;i++)
// 		{
// 			if(arr[i]>max)
// 			{
// 				max=arr[i];
// 			}
// 		}
// 		return max;
// 	}
// 	public static void main(String args[])
// 	{
// 		int arr[]={1,2,3,4,5};
// 		System.out.println(largest(arr));
// 	}
// }


public class largest{
	public static int largest(int no[])
	{
		int max=0;
		for(int i=0;i<no.length;i++)
		{
			if(no[i]>max)
			{
				max=no[i];
			}
		}
		return max;
	}
	public static void main(String args[])
	{
		int no[]={1,2,3,4,5,5};
		System.out.println(largest(no));
	}
}