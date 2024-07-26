Arrange given numbers to form the biggest number

Given an array of strings arr[] of length n, where every string representing a non-negative integers, the task is to arrange them in a manner such that after concatenating them in order, 
it results in the largest possible number. Since the result may be very large, return it as a string.

Example:

Input: n = 5, arr[] = {“3”, “30”, “34”, “5”, “9”}
Output: “9534330”
Explanation: Given numbers are {“3”, “30”, “34”, “5”, “9”}, the arrangement “9534330” gives the largest value.

Solution:

import java.util.*;
class BiggestNumber {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        String str[]=new String[n];
        for(int i=0;i<n;i++){
            str[i]=s.next();
        }
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                String ab=str[i]+str[j];
                String ba=str[j]+str[i];
                if(Integer.parseInt(ba)>Integer.parseInt(ab)){
                    String temp=str[i];
                    str[i]=str[j];
                    str[j]=temp;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(str[i]);
        }
    }
}
