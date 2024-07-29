Sort Characters By Frequency

Given a string s, sort it in decreasing order based on the frequency of the characters. The frequency of a character is the number of times it appears in the string.
Return the sorted string. If there are multiple answers, return any of them.

Example 1:

Input: s = "tree"
Output: "eert"

Example 2:

Input: s = "cccaaa"
Output: "aaaccc"

Solution:

class Solution {
    public String frequencySort(String s) {
        int freq[]=new int[256];
        for(char ch:s.toCharArray()){
            freq[ch]++;
        }
        ArrayList<Character> li=new ArrayList<>();
        for(char i=0;i<256;i++){
            if(freq[i]>0) {
                for(int j=0;j<freq[i];j++){
                    li.add(i);
                }
            }
        }
        li.sort((a,b)->freq[b]-freq[a]);
        StringBuilder str=new StringBuilder();
        for(char ch:li) str.append(ch);
        return str.toString();
    }
}
