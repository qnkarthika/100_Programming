65.Distribute Candies to People

We distribute some number of candies, to a row of n = num_people people in the following way:
We then give 1 candy to the first person, 2 candies to the second person, and so on until we give n candies to the last person.
Then, we go back to the start of the row, giving n + 1 candies to the first person, n + 2 candies to the second person, and so on until we give 2 * n candies to the last person.
This process repeats (with us giving one more candy each time, and moving to the start of the row after we reach the end) until we run out of candies.  
The last person will receive all of our remaining candies (not necessarily one more than the previous gift).
Return an array (of length num_people and sum candies) that represents the final distribution of candies.

Example 1:

Input: candies = 7, num_people = 4
Output: [1,2,3,1]

Solution:

class Solution {
    public int[] distributeCandies(int candies, int num_people) {

        int people[]=new int[num_people];
        int i=0;
        int j=1;

        while(candies>0){
             if(candies<j) people[i]+=candies;
             else people[i]+=j;
             candies-=j;
             j++;
             if(i<num_people-1) i++;
             else i=0;     
        }
        return people;
    }
}
