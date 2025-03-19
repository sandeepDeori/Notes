package LinkedList;
import java.util.ArrayList;
import java.util.LinkedList;


class Node{
    int val ;
    Node next ;

    Node(int val){
        this.val = val ;
        this.next = null ;
    }
}



public class practice{

    public static void main(String[] args) {
 
        Node n1 = new Node(10) ;
        Node n2 = new Node(20) ;
        Node n3 = new Node(30) ;
        Node n4 = new Node(40) ;

        n1.next = n2 ;
        n2.next = n3 ;
        n3.next = n4 ;
        
        
        Node temp = n1 ;

        while(temp!=null){
        System.out.println(temp.val) ;
         temp = temp.next ;
        }
      
    }

}


