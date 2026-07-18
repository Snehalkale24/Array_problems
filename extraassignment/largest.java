import java.util.*;
public class largest{

    public static void input(int arr[])
    {
        Scanner s = new Scanner(System.in);
        for(int i = 0; i < arr.length; i++)
        {
            System.out.println("Enter element:");
            arr[i] = s.nextInt();
        }
    }
   public static int largest(int arr[]){
    int largest=arr[0];
    for(int i=0;i<arr.length;i++)
    {
        if(arr[i]>largest)
        {
            largest=arr[i];
        }
    }
        return largest;
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
       int max = largest(arr);
       System.out.println("Largest element = " + max);
    }
}