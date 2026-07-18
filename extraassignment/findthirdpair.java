import java.util.*;

public class findthirdpair {

    public static void input(int arr[]) {
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element: ");
            arr[i] = s.nextInt();
        }
    }

   public static void pair(int arr[],int sum)
   {
   	System.out.println("pairs are:");
   	for(int i=0;i<arr.length;i++)
   	{
   		for(int j=i+1;j<arr.length;j++){
            for(int k=j+1;k<arr.length;k++){
   			if(arr[i]+arr[j]+arr[k]==sum)
   			{
   				System.out.println("("+arr[i]+ ","+arr[j]+ ","+arr[k]+")");
   			}
   		}
   	}
   }
}
    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter size: ");
        int size = s.nextInt();

        int arr[] = new int[size];

        input(arr);

        System.out.print("Enter target sum: ");
        int sum = s.nextInt();

        pair(arr, sum);
    }
}