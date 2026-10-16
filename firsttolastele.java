// import java.util.*;
// public class firsttolastele
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
// 	public static void shifttolast(int arr[])
// 	{
// 		int temp=arr[0];
// 		for(int i=1;i<arr.length;i++)
// 			arr[i-1]=arr[i];

// 		arr[arr.length-1]=temp;
// 	}
// 	public static void main(String args[])
// 	{
// 		Scanner s=new Scanner(System.in);
// 		System.out.println("enter size of element:");
// 		int size=s.nextInt();

// 		int arr[]=new int[size];
// 		input(arr);
// 		shifttolast(arr);
// 		for(int i=0;i<arr.length;i++)
// 		{
// 			System.out.print(arr[i]+ " ");
// 		}
// 	}
// }


// import java.util.*;

// public class firsttolastele {
//     public static void first(int no[]) {
//         int temp = no[0];

//         for (int i = 1; i < no.length; i++) {
//             no[i - 1] = no[i];
//         }

//         no[no.length - 1] = temp;
//     }

//     public static void main(String args[]) {
//         int no[] = {1, 2, 3, 4, 5};

//         first(no);

//         System.out.println(Arrays.toString(no));
//     }
// }

public class firsttolastele{
    public static void first(int arr[])
    {
        int temp=no[0];
        for(int i=1;i<arr.length;i++)
        {
            arr[i-1]=arr[i];
        }
        no[no.length-1]=temp;
    }
    public static void main(String args[])
    {
        int no[]={1,2,3,4};
        first(no);
    }
}
}