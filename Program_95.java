Write a program to get a string S, remove duplicate characters, and maintain the same order.

Input 1 : Hello World
Output 1 : Helo Wrd
  
Input 2 : Enjoy Moments
Output 2 : Enjoy Mmets

Solution:

import java.util.*;
class Main{
    
    public static String removeDuplicate(String str){
        StringBuilder sb=new StringBuilder();
        HashSet<Character> set=new HashSet<>();
        for(char ch:str.toCharArray()){
            if(ch!=' ' && !set.contains(ch)){
                sb.append(ch);
                set.add(ch);
            }
            else if(ch==' '){
                sb.append(" ");
            }
        }
        return sb.toString();
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        String res=removeDuplicate(str);
        System.out.print(res);
    }
}
