19. Rotate image

import java.util.*;
public class Main
{
    
	public static void main(String[] args) {
	   Scanner s=new Scanner(System.in);
	   int n=s.nextInt();
	   int arr[][]=new int[n][n];
	   for(int i=0;i<n;i++){
	       for(int j=0;j<n;j++){
	           arr[i][j]=s.nextInt();
	       }
	   }
	   //Transpose of matrix
	   for(int i=0;i<n;i++){
	       for(int j=i+1;j<n;j++){
	           int temp=arr[i][j];
	           arr[i][j]=arr[j][i];
	           arr[j][i]=temp;
	       }
	   }
	   int start=0;
	   int end=n-1;
	   //Reversing the column of the matrix
	   for(int i=0;i<n;i++){
	       while(start<end){
	           int temp=arr[i][start];
	           arr[i][start]=arr[i][end];
	           arr[i][end]=temp;
	           start++;
	           end--;
	       }
	       start=0;
	       end=n-1;
	   }
	   System.out.println();
	   //print the rotated array
	    for(int i=0;i<n;i++){
	       for(int j=0;j<n;j++){
	           System.out.print(arr[i][j]+" ");
	       }
	       System.out.println();
	   }
	}
}
