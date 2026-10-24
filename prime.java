// public class prime{
// 	public static Boolean prime(int no)
// 	{
// 		if(no<=1)
// 		{
// 			return false;
// 		}

// 		for(int i=2;i<no;i++)
// 		{
// 			if(no%i==0)
// 			{
// 				return false;
// 			}
// 		}
// 		return true;
// 	}
// 	public static void main(String args[])
// 	{
// 		int no=5;
// 		if(prime(no))
// 		{
// 			System.out.println("prime");
// 		}
// 		else{
// 			System.out.println("not prime");
// 		}
// 	}
// }

import java.util.*;
public class prime{
 public static boolean check(int no[])
 {
 	if(no<=1)
 	{
 		return false;
 	}
 	for(int i=2;i<no.length;i++)
 	{
 		if(no[i]%2==0)
 		{
 			return false;
 		}
 	}
 return true;
}
public static void main(String args[])
{
	int no=5;
	if(prime(no))
	{
		System.out.println("prime:");
	}
	else{
		System.out.println("not prime:");
	}
}
}