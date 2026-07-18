import java.util.*;
public class odd{
	public static void input(int arr[])
	{
		Scanner s=new Scanner(System.in);
		for(int i=0;i<arr.length;i++){
			System.out.println("enter element:");
			arr[i]=s.nextInt();
		}
	}
	public static int  odd(int arr[])
	{
		int sum=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2!=0)
			{
				sum=sum+arr[i];
			}
		}
		return sum;
	}
	public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    System.out.println("enter size:");
    int size=s.nextInt();

    int arr[]=new int[size];
    input(arr);
   
   int total=odd(arr);
   System.out.println("sum of odd no:"+total);
  }
}
