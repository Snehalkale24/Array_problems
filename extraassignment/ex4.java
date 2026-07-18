// import java.util.*;
// public class ex4
// {
// 	public static void input(int arr[])
// 	{
// 		Scanner s=new Scanner(System.in);
// 		for(int i=0;i<arr.length;i++)
// 		{
// 			System.out.println("enter size:");
// 			arr[i]=s.nextInt();
// 		}
// 	}
	
// 	public static void remove(int arr[])
// 	{
		
// 		for(int i=0;i<arr.length;i++)
// 		{
// 			int flag=0;
// 			for(int j=0;j<i;j++){
// 				if(arr[i]==arr[j])
// 				{
// 					flag=1;
// 					break;
// 				}
// 			}
// 			if(flag==0)
// {
//     System.out.print(arr[i]+" ");
// }
// 		}
// 	}
// 	public static void main(String args[])
// 	{
// 		Scanner s=new Scanner(System.in);
// 		System.out.println("enter element:");
// 		int size=s.nextInt();

// 		int arr[]=new int[size];
// 		input(arr);
// 		remove(arr);

// 		}
// 	}
import java.util.*;
public class ex4
{
	public static void input(int arr[]){
		Scanner s=new Scanner(System.in);
		for(int i=0;i<arr.length;i++){
			System.out.println("enter element:");
			arr[i]=s.nextInt();
		}
	}
	public static void duplicate(int arr[]){
		for(int i=0;i<arr.length;i++){
			int flag=0;
			for(int j=0;j<i;j++){
				if(arr[i]==arr[j])
				{
					flag=1;
					break;
				}
			}
			if(flag==0)
			{
			System.out.println(arr[i]);
		}
	}
}
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter size:");
		int size=s.nextInt();

		int arr[]=new int[size];
		input(arr);
		duplicate(arr);
	}
}