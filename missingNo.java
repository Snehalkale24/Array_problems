// public class missingNo{
// 	public static int missing(int no[],int n)
// 	{
// 		int sum=n*(n+1)/2;
// 		int total=0;
// 		for(int i=0;i<no.length;i++)
// 		{
// 			total=total+no[i];
// 		}
// 		return sum-total;
// 	}
// 	public static void main(String args[])
// 	{
// 		int no[]={1,2,3,4};
// 		System.out.println(missing(no,5));
// 	}
// }

import java.util.*;
public class missingNo{
	public static int missing(int no[],int n)
	{
		int sum=n*(n+1)/2;
		int total=0;
		for(int i=0;i<no.length;i++)
		{
			total=no[i]+total;
		}
		return sum-total;
	}
	public static void main(String args[])
	{
		int no[]={1,2,3,4,5};
		System.out.println(missin(no,6));
	}
}