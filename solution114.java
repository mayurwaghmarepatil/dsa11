package mayur;

public class solution114 {

		static int findRepeating(int[] arr)
		{
			for (int i = 0; i < arr.length; i++) {
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i] == arr[j])
						return arr[i];
				}
			}
			return -1;
		}

		
		static public void main(String[] args)
		{
			int[] arr
				= new int[] { 1,3,4,2,2 };
			int repeatingNum = findRepeating(arr);
			System.out.println(repeatingNum);
		}
	}

	