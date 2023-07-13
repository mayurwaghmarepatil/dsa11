package mayur;


	
	import java.io.*;

	public class solution117 {
	
	static int find_index(int[] arr, int n, int K)
	{
		
		
		for(int i = 0; i < n; i++)
		

			if (arr[i] == K)
				return i;

		
			else if (arr[i] > K)
				return i;

	
		return n;
	}

	
	public static void main(String[] args)
	{
		int[] arr = { 5,7,7,8,8,10 };
		int n = arr.length;
		int K = 8;
		
		System.out.println(find_index(arr, n, K));
	}
	

}
