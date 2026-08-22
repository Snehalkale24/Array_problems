// import java.util.*;
// public class secondlargest{

//     public static void input(int arr[])
//     {
//         Scanner s = new Scanner(System.in);
//         for(int i = 0; i < arr.length; i++)
//         {
//             System.out.println("Enter element:");
//             arr[i] = s.nextInt();
//         }
//     }
//    public static int secondlargest(int arr[]){
//     int firstlargest=arr[0];
//     int secondlargest=arr[0];
//     for(int i=0;i<arr.length;i++)
//     {
//         if(arr[i]>firstlargest)
//         {
//             secondlargest=firstlargest;
//             firstlargest=arr[i];
//         }
//     }
//         return secondlargest;
//     }
//     public static void display(int arr[])
//     {
//         for(int i = 0; i < arr.length; i++)
//         {
//             System.out.print(arr[i] + " ");
//         }
//     }
//     public static void main(String args[])
//     {
//         Scanner s = new Scanner(System.in);

//         System.out.println("Enter size:");
//         int size = s.nextInt();
//         int arr[] = new int[size];
//         input(arr);
//        int max = secondlargest(arr);
//        System.out.println("Largest element = " + max);
//     }
// }

import java.util.*;
public class secondlargest{
    public static int secondlargest(int arr[])
    {
        int first=0;
        int second=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>first)
            {
                second=first;
                first=arr[i]; 
            }
            else if(arr[i]> second)
            {
                second=arr[i];
            }
        }
        return second;
    }
    public static void main(String args[])
    {
        int[] second={232,122,123};
        System.out.println(secondlargest(second));
    }
}