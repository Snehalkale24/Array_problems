import java.util.*;
public class prime
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter no:");
		int n=s.nextInt();
		int count=0;
		if(n<=1)
		{
			System.out.println(n+"is not prime no:");
		}
		else{
			for(int i=1;i<=n;i++)
			{
				if(n%i==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println(n+"is prime:");
			}
			else{
				System.out.println(n+"is not:");
			}
		}

	}
}