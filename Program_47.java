47. Problem Statement -:

In an airport, the Airport authority decides to charge a minimum amount to the passengers who are carrying luggage with them. They set a threshold weight value, say, T, 
if the luggage exceeds the weight threshold you should pay double the base amount. If it is less than or equal to threshold then you have to pay $1.  

Solution:

import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        int t=s.nextInt();
        int sum=0;
        for(int i=0;i<n;i++){
            if(a[i]<=t) sum+=1;
            else sum+=2;
        }
        System.out.print(sum);
    }
}
