import java.util.*;
public class targetsum{
	public static int[] twosum(int nums[],int target)
	{
		int sum=0;
		for(int i=0;i<nums.length;i++)
		{
			for(int j=i+1;j<nums.length;j++)
			{
             if(nums[i]+nums[j]==target)
             {
             	return new int[]{i,j};
             }
			}
		}
			return new int[]{};
		}
	public static void main(String args[])
	{
		int target=9;
		int nums[]={1,2,7,4,3};
		System.out.println("target: " + target);
System.out.println("nums: " + Arrays.toString(nums));
	}
}