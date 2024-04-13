22. Valid parantheses

import java.util.*;
class Main{
    
    static boolean ValidOrNot(String str){
        
        Stack<Character> stack=new Stack<Character>();
        for(char c:str.toCharArray()){
            if(c=='[') stack.push(']');
            else if(c=='{') stack.push('}');
            else if(c=='(') stack.push(')');
            else if(stack.isEmpty() || c!=stack.pop()) return false;
        }
        return stack.isEmpty();
      
    }
  
    public static void main(String args[]){
      
        Scanner s=new Scanner(System.in);
        String str=s.next();
        boolean result=ValidOrNot(str);
        if(result==true) System.out.print(str+" is valid expression");
        else System.out.print(str+" is not a valid expression");
      
    }
    
}
