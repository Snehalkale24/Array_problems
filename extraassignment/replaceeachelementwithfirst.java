import java.util.*;

public class replaceeachelementwithfirst {

    public static void input(int arr[]) {
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element: ");
            arr[i] = s.nextInt();
        }
    }

   public static void pair(int arr[])
   {
   	for(int i=0;i<arr.length;i++){
        while(arr[i]>=10)
        {
            arr[i]=arr[i]/10;
        }

    }
}
public static void display(int arr[])
{
    for(int i=0;i<arr.length;i++)
    {
        System.out.println(arr[i]);
    }
}
    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter size: ");
        int size = s.nextInt();

        int arr[] = new int[size];

        input(arr);
        pair(arr);
        display(arr);
    }
}