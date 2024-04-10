3.Given year is leap year or not
  
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        
        System.out.print("Enter year: ");
        int year=s.nextInt();
        if (year%4==0 && year%100!=0){
            System.out.println(year+" is a leap year");
        }
        else if (year%400==0){
            System.out.println(year+" is a leap year");
        }
        else{
            System.out.println(year+" is not a leap year");
        }     

    }
}
