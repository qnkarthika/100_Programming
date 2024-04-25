
27. Given an array of integers ,find the count of elements greater than n/k.


input : n=12, k=4, arr= [1,1,1,1,1,2,2,3,3,3,3,4]
output : 2

Solution
  
import java.util.*;

public class Main

{
	public static int morethanNdK(int a[], int n, int k)
	{
		int x = n / k;
		HashMap<Integer, Integer> y = new HashMap<>();
		for (int i = 0; i < n; i++) {
	
			if (!y.containsKey(a[i]))
				y.put(a[i], 1);

			else {
				int count = y.get(a[i]);
				y.put(a[i], count + 1);
			}
		}
		
		int c=0;
	    for (Integer key : y.keySet()) {
             if (y.get(key) > x) { 
                    c++;
             }
        }
		 return c;
	}


	public static void main(String[] args)
	{

		int a[] = new int[] { 1, 1, 2, 2, 3, 5, 4,
							2, 2, 3, 1, 1, 1 };
		int n = 12;
		int k = 4;
		int c=morethanNdK(a, n, k);
		System.out.print(c);
	}
}
