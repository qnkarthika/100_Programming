13. Find the leaders of an array

  
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a size of an array:  ");
        int n=s.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter array elements: ");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        ArrayList<Integer> al=new ArrayList<Integer>();
        //Leaders of an array
        int max=arr[n-1];
        al.add(max);
        for(int i=n-2;i>=0;i--){
            if(arr[i]>max){
                al.add(arr[i]);
                max=arr[i];
            }
        }
        System.out.print("Leades of an array: ");
        for(int i=al.size()-1;i>=0;i--){
            System.out.print(al.get(i)+" ");
        }
    }
}
