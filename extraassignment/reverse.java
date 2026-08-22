// import java.util.*;
// public class reverse{

//     public static void input(int arr[])
//     {
//         Scanner s = new Scanner(System.in);
//         for(int i = 0; i < arr.length; i++)
//         {
//             System.out.println("Enter element:");
//             arr[i] = s.nextInt();
//         }
//     }
//    public static void reverse(int arr[]){
//     int start=0;
//     int end=arr.length-1;

//     while(start< end){
//         int temp=arr[start];
//         arr[start]=arr[end];
//         arr[end]=temp;
//         start++;
//         end--;
//     }
//    }
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
//         reverse(arr);

//         System.out.println("Array after right rotation:");
//         display(arr);
//     }
// }

public class reverse{
    public static void reverse(int arr[])
    {
        int start=0;
        int last=arr.length-1;
        while(start < last)
        {
            int temp=arr[start];
            arr[start]=arr[last];
            arr[last]=temp;
            start++;
            last--;
        }
    }
    public static void main(String args[])
    {
        int arr[]={1,2,3};
        reverse(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}