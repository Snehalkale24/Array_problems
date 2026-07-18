// import java.util.*;

// public class ex3 {

//     public static void input(int arr[])
//     {
//         Scanner s = new Scanner(System.in);
//         for(int i = 0; i < arr.length; i++)
//         {
//             System.out.println("Enter element:");
//             arr[i] = s.nextInt();
//         }
//     }
//     public static void delete(int arr[], int pos)
//     {
//         for(int i = pos; i < arr.length - 1; i++)
//         {
//             arr[i] = arr[i + 1];
//         }
//     }
//     public static void display(int arr[])
//     {
//         for(int i = 0; i < arr.length - 1; i++)
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

//         System.out.println("Enter position to delete:");
//         int pos = s.nextInt();
//         delete(arr, pos);
//         System.out.println("Array after deletion:");
//         display(arr);
//     }
// }

import java.util.*;
public class ex3
{
    public static void input(int arr[])
    {
        Scanner s=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            System.out.println("enter elemet:");
            arr[i]=s.nextInt();
        }
    }
    public static void delete(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j])
                {
                    System.out.println(arr[i]);
                }
            }
        }
       
    }
    public static void display(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("enter size:");
        int size=s.nextInt();

        int arr[]=new int[size];
       
        input(arr);
        delete(arr);

    }
}