11. Second Largest Element in an Array

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
        int max=l.get(0);
        int secondMax=l.get(0);
        for(int i=1;i<n;i++){
            if(l.get(i)>max){
                secondMax=max;
                max=l.get(i);
                
            }
            else if(l.get(i)>secondMax){
                secondMax=l.get(i);
            }
        }
        System.out.print("Second Largest Element: "+secondMax);
    }
}
