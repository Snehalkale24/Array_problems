import java.util.*;

public class ex1 {
    public static void input(int arr[]){
        Scanner s = new Scanner(System.in);
        for(int i = 0; i < arr.length; i++)
        {
            System.out.println("Enter element:");
            arr[i] = s.nextInt();
        }
    }
    public static void copyArray(int arr1[], int arr2[])
    {
        for(int i = 0; i < arr1.length; i++)
        {
            arr2[i] = arr1[i];
        }
    }
    public static void display(int arr[])
    {
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        } }

    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size:");
        int size = s.nextInt();
        int arr1[] = new int[size];
        int arr2[] = new int[size];
        System.out.println("Enter elements of first array:");
        input(arr1);
        copyArray(arr1, arr2);
        System.out.println("Elements of second array after copying:");
        display(arr2);
    }
}