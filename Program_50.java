50. Reverse Words in a String
Given an input string s, reverse the order of the words.
A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
Return a string of the words in reverse order concatenated by a single space.
Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.

class Solution {
    public String reverseWords(String s) {
        StringBuffer temp=new StringBuffer();
        StringBuffer result=new StringBuffer();
        String[] news=s.trim().split("\\s+");
        int k=0;
        for(int i=news.length-1;i>=0;i--){
            result.append(news[i]);
            result.append(" ");
        }
        return result.toString().trim();
    }
}
