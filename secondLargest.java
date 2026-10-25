// // public class secondLargest {
// //     public static int second(int arr[]) {
// //         int first = Integer.MIN_VALUE;
// //         int second = Integer.MIN_VALUE;

// //         for (int i = 0; i < arr.length; i++) {
// //             if (arr[i] > first) {
// //                 second = first;
// //                 first = arr[i];
// //             }
// //             else if (arr[i] > second && arr[i] != first) {
// //                 second = arr[i];
// //             }
// //         }
// //         return second;
// //     }
// //     public static void main(String args[]) {
// //         int arr[] = {10, 2, 3, 4, 5, 4, 4};
// //         System.out.println(second(arr));
// //     }
// // }

// public class secondlargest{
//     public static int second(int arr[])
//     {
//         int first=Integer.MIN_VALUE;
//         int last=Integer.MIN_VALUE;

//         for(int i=0;i<arr.length;i++)
//         {
//             if(arr[i]> first)
//             {
//                 second=first;
//                 first=arr[i];
//             }
//             else if(arr[i]>second && arr[i]!=first)
//             {
//                 second=arr[i]
//             }
//         }
//         return second;
//     }
//     public static void main(String args[])
//     {
//         int second[]={1,2,3,4};
//         System.out.println(second(second));
//     }
// }


public class secondlargest {
    int id;
    String name;

    secondlargest(int it, String name) {
        this.id = it;
        this.name = name;
    }

    public static void main(String args[]) {
        secondlargest s = new secondlargest(2, "snehal");
        System.out.println(s.id);
        System.out.println(s.name);
    }
}
