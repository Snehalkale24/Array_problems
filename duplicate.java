// public class duplicate{
// 	public static void duplicate(int arr[])
// 	{
// 		for(int i=0;i<arr.length;i++)
// 		{
// 			for(int j=i+1;j<arr.length;j++)
// 			{
// 				if(arr[i]==arr[j])
// 				{
// 					System.out.println(arr[i]);
// 					break;
// 				}
// 			}
// 		}
// 	}
// 	public static void main(String args[])
// 	{
// 		int arr[]={1,2,3,4,5,4,3};
// 		duplicate(arr);
// 	}
// }



public class duplicate{
	public static void dupl(int no[])
	{
		for(int i=0;i<no.length;i++)
		{
			for(int j=i+1;j<no.length;j++)
			{
				if(no[i]==no[j])
				{
					System.out.println(no[i]);
					break;
				}
			}
		}
	}
	public static void main(String args[])
	{
		int no[]={1,2,2,3,4,5,6};
		dupl(no);
	}
}