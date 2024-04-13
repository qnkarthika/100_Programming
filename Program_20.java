20. Longest Consecutive Sequence

import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        
        Set<Integer> set=new HashSet<Integer>();
        for(int i:arr){
        set.add(i);
        }
        
        int count=0;
        int maxCount=0;
        int index;
        for(int i=0;i<n;i++){
            if(!set.contains(arr[i]-1)){
                index=arr[i];
                count=1;
                while(set.contains(index+1)){
                    count++;
                    index++;
                }
                 maxCount=Math.max(count,maxCount);
            }
           
        }
        
        System.out.println("Long Consecutive Sequence count: "+maxCount);
    }
}
