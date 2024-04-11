17. Finding unique characters in string

import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        String str=s.next();
        int freq[]=new int[26];
        for(int i=0;i<26;i++){
            freq[i]=0;
        }
        for(int i=0;i<str.length();i++){
            freq[str.charAt(i)-'a']++;
        }
        for(int i=0;i<str.length();i++){
            if(freq[str.charAt(i)-'a']==1){
                System.out.print(str.charAt(i)+" ");
                
            }
        }
    }
}
