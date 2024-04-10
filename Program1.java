1.Factorial of Given Number
  
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        
        int fact=s.nextInt();
        int result=1;
        for(int i=2;i<=fact;i++){
            result*=i;
        }
        System.out.println("Factorial of given number: "+result);
    }
}
