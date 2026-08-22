public class StringCompression{
	public static void String(int arr[])
	{
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
				else{
					break;
				}
			}
			System.out.print(arr[i]+ " "+count);
		}
	}
	public static void main(String args[])
	{
		int arr[]={1,1,2,1,2,3,4};
		String(arr);
	}
}