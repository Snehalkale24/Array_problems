import java.util.*;

public class greaterthanelement {

    public static void input(int arr[])
    {
        Scanner s = new Scanner(System.in);

        for(int i = 0; i < arr.length; i++)
        {
            System.out.println("Enter element:");
            arr[i] = s.nextInt();
        }
    }

    public static double average(int arr[])
    {
        int sum = 0;

        for(int i = 0; i < arr.length; i++)
        {
            sum = sum + arr[i];
        }

        return (double)sum / arr.length;
    }

    public static void greater(int arr[], double avg)
    {
        System.out.print("Elements greater than average: ");

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] > avg)
            {
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter size:");
        int size = s.nextInt();

        int arr[] = new int[size];

        input(arr);

        double avg = average(arr);

        System.out.println("Average = " + avg);

        greater(arr, avg);
    }
}