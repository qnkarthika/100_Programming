76.First non-repeating character in a stream
Given an input stream A of n characters consisting only of lower case alphabets. While reading characters from the stream, you have to tell which character has appeared only once in the stream upto that point.
If there are many characters that have appeared only once, you have to tell which one of them was the first one to appear. If there is no such character then append '#' to the answer.
 
Example 1:

Input: A = "aabc"
Output: "a#bb"

Solution:


import java.util.*;
class Main {
    
    public static String firstNonRepeating(String str){
        int freq[]=new int[26];
        Queue<Character> queue=new LinkedList<>();
        StringBuffer result=new StringBuffer();
        for(char ch:str.toCharArray()){
            freq[ch-'a']++;
            if(freq[ch-'a']==1){
                queue.add(ch);
            }
            while(!queue.isEmpty() && freq[queue.peek()-'a']>1){
                queue.poll();
            }
            if(queue.isEmpty()){
                result.append("#");
            }
            else{
                result.append(queue.peek());
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.next();
        String result=firstNonRepeating(str);
        System.out.print(result);
    }
}
