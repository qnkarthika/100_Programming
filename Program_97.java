Infinite number of people are crossing a 2-d plane.They march in such a way that each integral x-coordinate will have exactly one person who moves along it in positive y direction, starting from (x,0)

The function takes an integer matrix barrier having n rows and 3 columns where n denotes the number of barriers.The ith barrier is defined by (xi,yi,di), which means that 
the barrier is blocking all the people who want to pass through points lying on line segment connecting (xi,yi) and (xi+d,yi).Once a person encounters a barrier, he stops

Find the number of people who will be blocked at some point while marching.

Input:

n=2;
x: 2 4
y: 3 6
d: 3 4

Output: 7


Solution:


import java.util.*;
class Main {
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       int n=s.nextInt();
       int x[]=new int[n];
       int y[]=new int[n];
       int d[]=new int[n];
       for(int i=0;i<n;i++){
           x[i]=s.nextInt();
           y[i]=s.nextInt();
           d[i]=s.nextInt();
       }
       HashSet<Integer> set=new HashSet<>();
       for(int i=0;i<n;i++){
           for(int j=x[i];j<=x[i]+d[i];j++){
               set.add(j);
           }
       }
           
           System.out.print(set.size());
       
    }
}
