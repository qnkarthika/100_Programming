75. Sum up the given number's digits until it reaches a single digit without using modulo operator.

  
Solution:

import java.util.*;
class Main {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.next();
        int sum=0;
        while(str.length()>1){
            sum=0;
        for(int i=0;i<str.length();i++){
            sum+=str.charAt(i)-'0';
        }
           str=Integer.toString(sum);
        }
        System.out.print(sum);
    }
}
