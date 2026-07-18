import java.util.*;
public class sum{
  public static void input(int arr[])
  {
    Scanner s=new Scanner(System.in);
    for(int i=0;i<arr.length;i++)
    {
      System.out.println("enter element:");
      arr[i]=s.nextInt();
    }
  }

  public static int sum(int arr[])
  {
    int sum=0;
    for(int i=0;i<arr.length;i++)
    {
      sum= sum+arr[i];
    }
    return sum;
  }
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    System.out.println("enter size:");
    int size=s.nextInt();

    int arr[]=new int[size];
    input(arr);
      int total= sum(arr);
      System.out.println("sum is:"+total);
  }
}