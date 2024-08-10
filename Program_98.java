Add alternate nodes in linked list
The function accepts a pointer to the start of the linked list, 'head' as its argument.Implement the function to modify the given list in such a way that original value of each node is
added to the value of next node and return the modified list

Input: 1->2->3->4->5->6->7
Output: 1->2->4->6->8->10->12

Solution:

import java.util.*;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}


class LinkedList{
     Node head;
    LinkedList(){
        this.head=null;
    }
    
    public void create(int value){
        Node newnode=new Node(value);
        if(head==null){
            head=newnode;
        }
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newnode;
        }
    }
    
    public void alterNode(){
        int A=head.data;
        int B=head.next.data;
        int C;
        Node temp=head.next.next;
        while(temp!=null){
            C=temp.data;
            temp.data=temp.data+A;
            A=B;
            B=C;
            temp=temp.next;
        }
    }
    
    public void printNode(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
}

class Main{
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++){
          a[i]=s.nextInt();
      }
      LinkedList li=new LinkedList();
      for(int i=0;i<n;i++){
          li.create(a[i]);
      }
      li.printNode();
       li.alterNode();
       li.printNode();
    }
}
