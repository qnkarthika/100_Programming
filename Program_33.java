
33. Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
  
For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9. 
X can be placed before L (50) and C (100) to make 40 and 90. 
C can be placed before D (500) and M (1000) to make 400 and 900.

Solution

  
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.next();
		Map<Character,Integer> roman=new HashMap<>();
		roman.put('I',1);
		roman.put('V',5);
		roman.put('X',10);
		roman.put('L',50);
		roman.put('C',100);
		roman.put('D',500);
		roman.put('M',1000);
		int result=0;
		for(int i=0;i<str.length();i++){
		    int currentValue=roman.get(str.charAt(i));
		    if(i<str.length()-1 && roman.get(str.charAt(i+1))>currentValue){
		        result-=currentValue;
		    }
		    else{
		        result+=currentValue;
		    }
		}
		System.out.print("Value: "+result);
		
	}
}
