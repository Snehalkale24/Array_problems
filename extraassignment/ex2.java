import java.util.*;

public class ex2 {

    public static void input(int arr[])
    {
        Scanner s = new Scanner(System.in);

        for(int i = 0; i < arr.length - 1; i++)
        {
            System.out.println("Enter element:");
            arr[i] = s.nextInt();
        }
    }
    public static void insertElement(int arr[], int pos, int element, int size)
    {
        for(int i = size - 1; i >= pos; i--)
        {
            arr[i + 1] = arr[i];
        }
        arr[pos] = element;
    }
    public static void display(int arr[], int size)
    {
        for(int i = 0; i < size; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter size:");
        int size = s.nextInt();
        int arr[] = new int[size + 1];
        input(arr);
        System.out.println("Enter position (0 to " + (size - 1) + "):");
        int pos = s.nextInt();
        System.out.println("Enter element to insert:");
        int element = s.nextInt();
        insertElement(arr, pos, element, size - 1);
        System.out.println("Array after insertion:");
        display(arr, size);
    }
}