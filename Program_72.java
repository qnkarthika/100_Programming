Pascal's Triangle
Given an integer numRows, return the first numRows of Pascal's triangle.

Example 1:

Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
Example 2:

Input: numRows = 1
Output: [[1]]

Solution:

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res=new ArrayList<>();
        if(numRows==0) return res;
        List<Integer> first_row = new ArrayList<>();
        first_row.add(1);
        res.add(first_row);
        
        for(int i=1;i<numRows;i++){
            List<Integer> prev=res.get(i-1);
            List<Integer> row=new ArrayList<>();
            row.add(1);
            for(int j=1;j<i;j++){
                 row.add(prev.get(j-1)+prev.get(j));
            }
            row.add(1);
            res.add(row);

        }
        return res;
    }
}
