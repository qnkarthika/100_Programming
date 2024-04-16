25. Problem Statement

Emma, a scientist, is studying galactosides and needs to send stone samples to a chemical lab for analysis.
However, there's a challenge: the lab only approves stone pieces that fall within specific size ranges, measured in parts per million (ppm).
Emma receives these stone pieces one by one, and she must sort them based on their size to meet the lab's requirements. 
This task can be extremely daunting as the number of stone pieces can be massive, potentially in tons.

Your task is to assist Emma by developing a code that can efficiently categorize the stone pieces into the approved size ranges designated by the lab.

Input format :
The first line consists of two integers: S and R, where S is the number of stone pieces and R is the number of ranges in the lab.
The second line of input consists of S space-separated integers in ppm.
The next R lines, each of which consists of two positive integers separated by a space, indicate the minimum and maximum size.

Output format :
The output consists of R lines, where the ith line contains a single non-negative integer indicating the number of the samples that lie in the ith range.

PROGRAM:
import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int stone=s.nextInt();
        int range=s.nextInt();
        int arr[]=new int[stone];
        for(int i=0;i<stone;i++){
            arr[i]=s.nextInt();
        }
        int a[]=new int[range];
        int b[]=new int[range];
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<range;i++){
                a[i]=s.nextInt();
                b[i]=s.nextInt();
        }
        int result[]=new int[range];
        for(int i=0;i<range;i++){
            result[i]=0;
        }
       for(int i=0;i<stone;i++){
           for(int j=0;j<range;j++){
               if(arr[i]>=a[j] && arr[i]<=b[j]){
                   result[j]++;
               }
           }
       }
       for(int i=0;i<range;i++){
           System.out.println(result[i]);
       }
    }
}

