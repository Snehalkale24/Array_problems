// import java.util.*;
// public class avgevenandodd
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
// 	public static void display(int arr[])
// 	{
// 		for(int i=0;i<arr.length;i++)
// 			System.out.print(arr[i]+ " ");
// 	}
// 	public static double Even(int arr[])
// 	{
// 		double sum=0;
// 		int cnt=0;
// 		for(int i=0;i<arr.length;i++)
// 		{
// 			if(arr[i]%2==0)
// 			{
// 			sum = sum + arr[i];
// 			cnt++;
// 		}
// 	}
// 	return sum / cnt;
// }
// public  static double Odd(int arr[])
// {
// 	double sum=0;
// 	int cnt=0;
// 	for(int i=0;i<arr.length;i++)
// 	{
// 		if(arr[i]%2==1)
// 		{
// 			sum = sum+arr[i];
// 			cnt++;
// 		}
// 	}
// 	return sum/cnt;
// }
// public static void main(String args[])
// {
// 	Scanner s=new Scanner(System.in);
// 	System.out.println("enter size");
// 	int size=s.nextInt();


// 	int arr[]=new int[size];
// 	input(arr);
// 	System.out.println("even "+ Even(arr));
// 	System.out.println("odd"+ Odd(arr));
// }
// }
public class avgevenandodd{
	public static void evenandodd(int arr[])
	{
		int even=0;
		int odd=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.println(even);
			}
			else{
				System.out.println(odd);
			}
		}
	}
	public static void main(String args[])
	{
		int arr[]={1,2,3,6,2,4,2};
		evenandodd(arr);
	}

}