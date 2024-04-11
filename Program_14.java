14. Finding the pivot element

import java.util.*;
class Pivot{
    int pivotElement(int sum,int total,int n){
    for(int i=n;i>=1;i--){
             sum+=i;
             if(total==sum) return i;
             total-=i;
         }
         return -1;
    }
}
class Main {
    public static void main(String[] args) {
         Scanner s=new Scanner(System.in);
         int n=s.nextInt();
         int total=n*(n+1)/2;
         int sum=0;
         Pivot p=new Pivot();
        int result= p.pivotElement(sum,total,n);
        System.out.print("Pivot Element: "+result);
         
    }
}
