import java.util.*;
public class ex1
{
	public static void display(int A[])
	{
		for(int i=0;i<A.length;i++)
		{
			System.out.println("index:" + i+ " = " + A[i]);
		}
	}
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int size;
		System.out.println("enter size:");
		size=s.nextInt();


		int arr[]=new int[size];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("enter element:");
			arr[i]=s.nextInt();
		}
		display(arr);
		s.close();
	}
}



































// import java.util.*;

// public class ex1
// {
//     public static void main(String args[])
//     {
//         Scanner s = new Scanner(System.in);

//         int size;
//         System.out.println("Enter size:");
//         size = s.nextInt();

//         int arr[] = new int[size];

//         for(int i = 0; i < arr.length; i++)
//         {
//             System.out.println("Enter element:");
//             arr[i] = s.nextInt();
//         }

//         // Display array
//         for(int i = 0; i < arr.length; i++)
//         {
//             System.out.println(arr[i]);
//         }

//         s.close();
//     }
// }
// op -- enter size =5;
//       enter element=11
//       enter element=22
//       enter element=33
//       enter element=44
//       enter element=55
//       index0=11
//       index1=22
//       index2=33
//       index3=44
//       index4=55