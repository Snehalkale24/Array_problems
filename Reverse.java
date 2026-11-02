// public class Reverse{
// 	public static void Reverse(int arr[])
// 	{
// 		int start=0;
// 		int end=arr.length-1;
// 		while(start<end)
// 		{
// 			int temp=arr[start];
// 			arr[start]=arr[end];
// 			arr[end]=temp;
// 			start++;
// 			end--;
// 		}
// 		for(int i=0;i<arr.length;i++)
// 		{
// 			System.out.println(arr[i]+" ");
// 		}
// 	}
// 	public static void main(String args[])
// 	{
// 		int arr[]={1,2,3,4,5};
// 		Reverse(arr);
// 	}
// }

public class Reverse{
	public static void reverse(int no[])
	{
		int start=0;
		int end=no.length-1;
		while(start < end)
		{
			int temp=no[start];
			no[start]=no[end];
			no[end]=temp;
			start++;
			end--;
		}
		for(int i=0;i<no.length;i++)
		{
			System.out.println(no[i]+" ");
		}
	}
	public static void main(String args[])
	{
		int no[]={1,2,3,4,5};
		reverse(no);
	}
}