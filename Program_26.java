26. Sort the array contains 0's,1's and 2's

Input : [0,2,2,1,0,1]
Output : [0,0,1,1,2,2]

Solution

import java.util.*;
public class Main
{
    
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=s.nextInt();
		}
		int low=0,high=n-1,mid=0;
		while(mid<=high){
		    if(arr[mid]==0){
		        int temp=arr[low];
		        arr[low]=arr[mid];
		        arr[mid]=temp;
		        low++;
		        mid++;
		    }
		   else if(arr[mid]==1){
		        mid++;
		    }
		    else if(arr[mid]==2){
		        
		        int temp=arr[mid];
		        arr[mid]=arr[high];
		        arr[high]=temp;
		        high--;
		        mid++;
		    }
		}
		System.out.print("Sorted Array: ");
		for(int i=0;i<n;i++){
		    System.out.print(arr[i]+" ");
		}
	}
}
