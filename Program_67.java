Group Anagrams

Given an array of strings strs, group the anagrams together. You can return the answer in any order.
An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

Example 1:

Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
Example 2:

Input: strs = [""]
Output: [[""]]
Example 3:

Input: strs = ["a"]
Output: [["a"]]


Solution:

import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> result=new ArrayList<>();
        List<String> li=new ArrayList<>();
        for(String str:strs){
            char arr[]=str.toCharArray();
            Arrays.sort(arr);
            String sorted=new String(arr);
            int index=li.indexOf(sorted);
            if(index==-1){
                ArrayList<String> newList=new ArrayList<>();
                newList.add(str);
                result.add(newList);
                li.add(sorted);
            }
            else{
                result.get(index).add(str);
            }
        }
        return result;
    }
}
