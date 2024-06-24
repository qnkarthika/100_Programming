46.Problem Statement – Akshay loves to go to WONDERLA , an amusement park. They are offering students who can code well with some discount. Our task is to reduce the cost of the ticket as low as possible.
The cost of tickets can be removed by removing the digits from the price given. They will give some k turns to remove the digits from the price of the ticket. Your task is to help Akshay in coding a 
program that can help him to reduce the cost of a ticket by removing the digits from its price and getting the maximum possible discount.
Note – You cannot make the cost of a ticket zero. For eg -: If the cost of a ticket is 100, and you have 2 turns to reduce the price, the final price will be 1 and not zero.

Constraints:

1 <= number of tickets <= 10^5
1 <= K < Number of digits in Price of ticket

Solution:

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ticketPrice = scanner.nextLine();
        int k = scanner.nextInt();
        
        System.out.println(minimizeTicketPrice(ticketPrice, k));
    }

    public static String minimizeTicketPrice(String ticketPrice, int k) {
        int n = ticketPrice.length();
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < n; i++) {
            char currentDigit = ticketPrice.charAt(i);
            
            while (!stack.isEmpty() && k > 0 && stack.peek() > currentDigit) {
                stack.pop();
                k--;
            }
            
            stack.push(currentDigit);
        }
        
        while (k > 0 && !stack.isEmpty()) {
            stack.pop();
            k--;
        }
        
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }
        result.reverse(); 
        

        while (result.length() > 1 && result.charAt(0) == '0') {
            result.deleteCharAt(0);
        }
        
        return result.toString();
    }
}
