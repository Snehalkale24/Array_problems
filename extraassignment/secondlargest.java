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
public class secondlargest
{
    public static void input(int arr[]){
        Scanner s=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            System.out.println("ente element:");
            arr[i]=s.nextInt();
        }
    }
    public static int  secondlargest(int arr[]){
        int firstlargest=0;
        int secondlargest=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>firstlargest){
                secondlargest=firstlargest;
                firstlargest=arr[i];
            }
        }
        return secondlargest;
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("enter size of element:");
        int size=s.nextInt();

        int arr[]=new int[size];
        input(arr);
        int ss=secondlargest(arr);
        System.out.println("secondlargest"+ss);
    }
}