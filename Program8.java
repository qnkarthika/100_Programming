8. Finding a single element in an array

  
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter size of an array:  ");
        int n=s.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter array elements: ");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int num=0;
        for(int i=0;i<n;i++){
            num=num^arr[i];
        }
        System.out.println("Single Element in an array is " +num);
    }
}
