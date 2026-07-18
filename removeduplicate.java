// public class removeduplicate {

//     public static void removeduplicate(int arr[]) {

//         for (int i = 0; i < arr.length; i++) {
//             int flag = 0;

//             for (int j = 0; j < i; j++) {
//                 if (arr[i] == arr[j]) {
//                     flag = 1;
//                     break;
//                 }
//             }

//             if (flag == 0) {
//                 System.out.print(arr[i] + " ");
//             }
//         }
//     }

//     public static void main(String[] args) {

//         int arr[] = {10, 20, 30, 20, 40, 10, 50, 30};

//         System.out.println("Array after removing duplicates:");
//         removeduplicate(arr);
//     }
// }

import java.util.*;
public class removeduplicate
{
	public static void input(int arr[])
	{
		Scanner s=new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("enter size:");
			arr[i]=s.nextInt();
		}
	}
	
	public static void remove(int arr[])
	{
		
		for(int i=0;i<arr.length;i++)
		{
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
    System.out.print(arr[i]+" ");
}
		}
	}
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter element:");
		int size=s.nextInt();

		int arr[]=new int[size];
		input(arr);
		remove(arr);

		}
	}
