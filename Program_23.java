23. Contains Duplicate

import java.util.*;
class Main{
    
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n-1;i++){
            arr[i]=s.nextInt();
        }
        
        boolean flag=false;
        Arrays.sort(arr);
        for(int i=0;i<n-1;i++){
            if(arr[i]==arr[i+1]){
                flag=true;
                break;
            }
        }
        if(flag==true) System.out.print("Yes,the array contains duplicate element");
        else System.out.print("No,the array does not contains any duplicate element");
    }
    
}
