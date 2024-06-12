38.Given an amount, find the minimum number of notes of different denominations that sum up to the given amount. Starting from the highest denomination note,
try to accommodate as many notes as possible for a given amount.We may assume that we have infinite supply of notes of values {2000, 500, 200, 100, 50, 20, 10, 5, 1} 

Example:
 
Input : 800
Output : Currency  Count 
         500 : 1
         200 : 1
         100 : 1


Solution;


import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int amount[]=new int[]{2000,500,200,100,50,20,10,5,1};
        int arr[]=new int[9];
        int value=s.nextInt();
        for(int i=0;i<9;i++){
            if(value>=amount[i]){
                arr[i]=value/amount[i];
                value%=amount[i];
            }
        }
        System.out.println("Currency Count->");
        
        for(int i=0;i<9;i++){
            if(arr[i]!=0){
                System.out.println(amount[i]+": "+arr[i]);
            }
        }
    }
}
