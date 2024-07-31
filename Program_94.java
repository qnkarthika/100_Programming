Suppose you have a stack of integers and you want to find the next greater element for each element in the stack. 
The next greater element for a given element x is the first element to its right that is greater than x. If no such element exists, the output value for that element should be -1. 

Example
  
Input: {5, 3, 8, 4, 2, 7, 1, 6}

Output: {8, 8, -1, 7, 7, -1, 6, -1}

Explanation:

For element 5, the next greater element is 8.
For element 3, the next greater element is 8.
For element 8, there is no greater element to its right, so the output value is -1.
For element 4, the next greater element is 7.
For element 2, the next greater element is 7.
For element 7, there is no greater element to its right, so the output value is -1.
For element 1, the next greater element is 6.
For element 6, there is no greater element to its right, so the output value is -1.

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
        Stack<Integer> st=new Stack<>();
        int res[]=new int[n];
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=a[i]) st.pop();
            if(st.isEmpty()) res[i]=-1;
            else{
                res[i]=st.peek();
            }
            st.push(a[i]);
        }
        System.out.print("Next Greater Elements: ");
        for(int i=0;i<n;i++){
            System.out.print(res[i]+" ");
        }
    }
}
