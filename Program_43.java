Given an array nums of positive integers of size N. Find all distinct digits present in nums.
 

Example:

Input: nums = [131, 11, 48]
Output: 1 3 4 8
Explanation: 1, 3, 4, and 8 are only distinct digits that can be extracted from the numbers of the array.

Solution:


import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        List<Integer> digits=findUnique(arr);
        for(int num:digits){
            System.out.print(num+" ");
        }
        
    }
    public static List<Integer> findUnique(int[] num){
        boolean[] digit=new boolean[10];
        for(int nums:num){
            while(nums>0){
                int dig=nums%10;
                nums/=10;
                digit[dig]=true;
            }
        }
        List<Integer> result=new ArrayList<>();
        for(int i=0;i<10;i++){
            if(digit[i]){
                result.add(i);
            }
        }
        return result;
    }
}
