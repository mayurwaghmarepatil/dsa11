package mayur;

	
	import java.util.*;


public class solution115 {
		static void getUnion(int a[], int n, int b[], int m)
		{

			HashSet<Integer> s = new HashSet<>();

			for (int i = 0; i < n; i++)
				s.add(a[i]);

			for (int i = 0; i < m; i++)
				s.add(b[i]);
			System.out.print(
				"Number of elements after union operation: "
				+ s.size() + "\n");
			System.out.print("The union set of both arrays is :"
							+ "\n");

			System.out.print(
				s.toString()
				+ " "); 
		}

		
		public static void main(String[] args)
		{
			int a[] = { 1, 2, 2,1 };
			int b[] = { 2,2};

			getUnion(a, 4, b, 2);
		}
	}

