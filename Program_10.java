10.Right rotate of array with k rotations

  
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter size of an array:  ");
        int n=s.nextInt();
        ArrayList<Integer> l=new ArrayList<Integer>();
        System.out.print("Enter array elements: ");
        for(int i=0;i<n;i++){
            l.add(s.nextInt());
        }
        System.out.print("Enter number of rotation: ");
       int rotation=s.nextInt();

  
       for(int i=0;i<rotation;i++){
           int lastElement=l.remove(l.size()-1);
           l.add(0,lastElement);
       }
       System.out.print("Array after " +rotation+ " rotation: ");
       for(int i=0;i<n;i++){
            System.out.print(l.get(i)+" ");
        }
    }
}
