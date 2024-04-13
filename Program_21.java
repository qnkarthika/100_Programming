21. Armstrong Number

import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int count=(int)Math.log10(n)+1;
       
        int copy=n;
        int sum=0;
        int rem;
        
        //Armstrong Number
        while(n>0){
            rem=n%10;
            sum+=Math.pow(rem,count);
            n/=10;
        }
        if(sum==copy) System.out.print(copy+" is an Armstrong Number");
        else System.out.print(copy+" is not an Armstrong Number");
    }
}
