import java.util.*;

public class ex8 {

    public static void input(int arr[])
    {
        Scanner s = new Scanner(System.in);
        for(int i = 0; i < arr.length; i++)
        {
            System.out.println("Enter element:");
            arr[i] = s.nextInt();
        }
    }
    public static void rightrotate(int arr[])
    {
        int temp = arr[arr.length - 1];
        for(int i = arr.length - 1; i > 0; i--)
        {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;
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
        rightrotate(arr);

        System.out.println("Array after right rotation:");
        display(arr);
    }
}