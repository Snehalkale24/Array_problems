// import java.util.*;
// public class Average
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
// 	public static double avg(int arr[])
// 	{
// 		double sum=0;
// 		for(int i=0;i<arr.length;i++)
// 		{
// 			sum = sum+arr[i];
// 		}
// 		return sum/arr.length;
// 	}
// 	public static void main(String args[])
// 	{
// 		Scanner s=new Scanner(System.in);
// 		System.out.println("enter size:");
// 		int size=s.nextInt();


// 		int arr[]=new int[size];
// 		input(arr);
// 		double avgg=avg(arr);
// 		System.out.println("avg:"+avgg);
// 	}
// }
// import java.util.*;
// public class Average{
// 	public static int avg(int no[])
// 	{
		
// 		int sum=0;
// 		for(int i=0;i<no.length;i++)
// 		{
//           sum=no[i]+sum;
// 		}
// 		return sum/no.length;
// 	}
// 	public static void main(String args[])
// 	{
// 		int no[]={1,2,3,4};
// 		System.out.println(avg(no));
// 	}
// }


import java.util.*;
public class Average{
	public static int avg(int no[])
	{
		int sum=0;
		for(int i=0;i<no.length;i++)
		{
			sum=sum+no[i];
		}
		return sum/no.length;
	}
	public static void main(String args[])
	{
		int no[]={1,2,3,4,5};
		System.out.println(avg(no));
	}
}