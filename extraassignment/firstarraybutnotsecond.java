// public class firstarraybutnotsecond{
// 	public static void array(int a[],int b[])
// 	{
// 		for(int i=0;i<a.length;i++)
// 		{
// 			int count=0;
// 			for(int j=0;j<b.length;j++)
// 			{
// 				if(a[i]==b[j])
// 				{
// 					count++;
// 				}
// 			}
// 			if(count==0)
// 			{
// 				System.out.println(a[i]+" ");
// 			}
// 		}
// 	}
// 	public static void main(String args[])
// 	{
// 		int a[]={1,2,3,4,5};
// 		int b[]={2,4};
// 		array(a,b);
// 	}
// }

public class firstarraybutnotsecond{
	public static void array(int a[],int b[])
	{
		for(int i=0;i<a.length;i++)
		{
			int count=0;
			for(int j=0;j<b.length;j++)
			{

				if(a[i]==b[j])
				{
					count++;
				}
				if(count==0)
				{
					System.out.println(a[i]+" ");
				}
			}
		}
		public static void main(String args[])
		{
			int a[]={1,2,3,4,5};
			int b[]{1,7,3};
			System.out.println(a,b);
		}
	}
}