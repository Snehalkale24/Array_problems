// import java.util.*;
// public class merge
// {
// 	public static void input(int arr[])
// 	{
// 		Scanner s=new Scanner(System.in);
// 		for(int i=0;i<arr.length;i++)
// 		{
// 			System.out.print("enter element:");
// 			arr[i]=s.nextInt();
// 		}
// 	}
// 	public static void sort(int arr1[],int arr2[],int arr3[])
// 	{
// 		int k=0;
// 		for(int i=0;i<arr1.length;i++)
// 		{
// 			arr3[k]=arr1[i];
// 			k++;
// 		}
// 		for(int i=0;i<arr2.length;i++){
// 			arr3[k]=arr2[i];
// 			k++;
// 		}
// 	}

// 	public static void display(int arr[])
// 	{
// 		for(int i=0;i<arr.length;i++)
// 		{
// 			System.out.print(arr[i]+ " ");
// 		}
// 	}

// 	public static void main(String args[])
// 	{
// 		Scanner s=new Scanner(System.in);
// 		System.out.println("enter size:");
// 		int size=s.nextInt();

// 		int arr1[]=new int[size];
// 		int arr2[]=new int[size];
// 		int arr3[]=new int[arr1.length+arr2.length];
// 		System.out.println("enter first element:");
// 		input(arr1);
// 		System.out.println("enter second element:");
// 		input(arr2);
// 		sort(arr1,arr2,arr3);
// 		display(arr3);
// 	}
// }

// public class merge
// {
// 	public static void merge(int arr1[],int arr2[],int arr3[])
// 	{
// 		int k=0;
//      for(int i=0;i<arr1.length;i++)
//      {
//      	arr3[k]=arr1[i];
//      	k++;
//      }
//      for(int i=0;i<arr2.length;i++)
//      {
//      	arr3[k]=arr2[i];
//      	k++;
//      }
//      for(int i=0;i<arr3.length;i++)
//      {
//      	System.out.println(arr3[i]);
//      }
// 	}
// 	public static void main(String args[])
// 	{
// 		int arr1[]={1,2,3};
// 		int arr2[]={4,5};
// 		int arr3[]=new int[arr1.length+arr2.length];
// 		merge(arr1,arr2,arr3);
// 	}
// }