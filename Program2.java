2.Find the given number is odd or even
  
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        
        int num=s.nextInt();
        if(num%2==0) System.out.println(num+" is an even number");
        else System.out.println(num+" is an odd number");

    }
}
