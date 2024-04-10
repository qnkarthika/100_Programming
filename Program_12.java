12. Reverse the number

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a number to reverse:  ");
        int n=s.nextInt();
        int copy=n;
        int rem,result=0;
        while(copy>0){
            rem=copy%10;
            result=result*10+rem;
            copy/=10;
        }
        System.out.print("Reversed Number: "+result);
    }
}
