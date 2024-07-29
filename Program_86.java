Sequential Digits

An integer has sequential digits if and only if each digit in the number is one more than the previous digit. Return a sorted list of all the integers
in the range [low, high] inclusive that have sequential digits.

Example 1:

Input: low = 100, high = 300
Output: [123,234]
  
Example 2:

Input: low = 1000, high = 13000
Output: [1234,2345,3456,4567,5678,6789,12345]

Solution:

class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        int lb=Integer.toString(low).length();
        int ub=Integer.toString(high).length();
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=lb;i<=ub;i++){
            for(int j=1;j<=10-i;j++){
                int current=j;
                int num=0;
                for(int k=0;k<i;k++){
                    num=num*10+current;
                    current++;
                }
                if(num>high) return res;
                if(num>=low) res.add(num);
            }
        }
        return res;
    }

}
