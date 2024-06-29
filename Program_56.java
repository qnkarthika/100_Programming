56.Find the Child Who Has the Ball After K Seconds
You are given two positive integers n and k. There are n children numbered from 0 to n - 1 standing in a queue in order from left to right.
Initially, child 0 holds a ball and the direction of passing the ball is towards the right direction. After each second, the child holding the ball passes it to the child next to them. 
Once the ball reaches either end of the line, i.e. child 0 or child n - 1, the direction of passing is reversed.
Return the number of the child who receives the ball after k seconds.

Example 1:

Input: n = 3, k = 5
Output: 1

Solution:

class Solution {
    public int numberOfChild(int n, int k) {
        int effectivek=k%(2*(n-1));
        boolean movingright=true;
        int position=0;
        for(int i=0;i<effectivek;i++){
              if(movingright){
                  position++;
                  if(position==n-1){
                    movingright=false;
                  }
              }
              else{
                position--;
                if(position==0){
                    movingright=true;
                }
              }
           
        }
           return position;
    }
}
