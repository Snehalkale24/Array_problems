// import java.util.*;

// public class ex6 {

//     public static void input(int arr[])
//     {
//         Scanner s = new Scanner(System.in);
//         for(int i = 0; i < arr.length; i++)
//         {
//             System.out.println("Enter element:");
//             arr[i] = s.nextInt();
//         }
//     }
//     public static void separate(int arr[])
//     {
//         int even[] = new int[arr.length];
//         int odd[] = new int[arr.length];

//         int even1 = 0, odd1 = 0;
//         for(int i = 0; i < arr.length; i++)
//         {
//             if(arr[i] % 2 == 0)
//             {
//                 even[even1] = arr[i];
//                 even1++;
//             }
//             else
//             {
//                 odd[odd1] = arr[i];
//                 odd1++;
//             }
//         }
//         System.out.print("Even elements: ");
//         for(int i = 0; i < even1; i++)
//         {
//             System.out.print(even[i] + " ");
//         }
//         System.out.println();

//         System.out.print("Odd elements: ");
//         for(int i = 0; i < odd1; i++)
//         {
//             System.out.print(odd[i] + " ");
//         }
//     }

//     public static void main(String args[])
//     {
//         Scanner s = new Scanner(System.in);

//         System.out.println("Enter size:");
//         int size = s.nextInt();
//         int arr[] = new int[size];
//         input(arr);

//         separate(arr);
//     }
// }

import java.util.*;
public class ex6{
    public static void input(int arr[]){
        Scanner s=new Scanner(System.in);
        for(int i=0;i<arr.length;i++)
        {
            System.out.println("enter element:");
            arr[i]=s.nextInt();
        }
    }
    public static void separate(int arr[]){
        int even[]=new int[arr.length];
        int odd[]=new int[arr.length];

        int even1=0;
        int odd1=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i] % 2 == 0){
                even[even1]=arr[i];
                even1++;
            }
            else{
                odd[odd1]=arr[i];
                odd1++;
            }
        }
        System.out.println("even no");
        for(int i=0;i<even1;i++)
        {
            System.out.println(even[i]+" ");
        }
        System.out.println();
    
     System.out.println("odd no");
        for(int i=0;i<odd1;i++)
        {
            System.out.println(odd[i]+" ");
        }
        System.out.println();

}
public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("enter size:");
    int size=s.nextInt();
    int arr[]=new int[size];
    input(arr);
    separate(arr);
}
}
