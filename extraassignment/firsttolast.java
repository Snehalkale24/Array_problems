//swap first and last element
import java.util.*;

public class ex9{

    public static void input(int arr[])
    {
        Scanner s = new Scanner(System.in);
        for(int i = 0; i < arr.length; i++)
        {
            System.out.println("Enter element:");
            arr[i] = s.nextInt();
        }
    }
    public static void swap(int arr[])
    {
        int temp = arr[0];
        arr[0]=arr[arr.length-1];
        arr[arr.length-1]=temp;
    }

    public static void display(int arr[])
    {
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter size:");
        int size = s.nextInt();
        int arr[] = new int[size];
        input(arr);
        swap(arr);

        System.out.println("Array after right rotation:");
        display(arr);
    }
}