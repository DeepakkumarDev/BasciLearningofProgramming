import java.lang.*;
import java.util.*;
public class LinkedListUse {
    public static Node<Integer> createLinkedList(){
        Node<Integer> n1=new Node<>(10);
        Node<Integer> n2=new Node<>(20);
        Node<Integer> n3=new Node<>(30);
        Node<Integer> n4=new Node<>(40);
        n1.next=n2;
        //System.out.println("n1 "+n1+"data "+n1.data+"next "+n1.next);
        n2.next=n3;
        //System.out.println("n2 "+n2+"data "+n2.data+"next "+n2.next);
        n3.next=n4;
        //System.out.println("n3 "+n3+"data "+n3.data +"next "+n3.next);
        // System.out.println("n4 "+n4+"data "+n4.data+"next "+n4.next);
        return n1;
    }
    public static void print(Node<Integer> head){
        //System.out.println("Print "+head);
        //System.out.println(head.data);
        //System.out.println(head.next.data);
        //System.out.println(head.next.next.data);
        //System.out.println(head.next.next.next.data);
        Node<Integer> temp=head;

        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println("@nd Iteration");
        //temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }        

    }

    public static void increment(Node<Integer> head){
        //head.data++;
        Node<Integer> temp=head;
        while(temp!=null){
            temp.data++;
            temp=temp.next;
        }
    }
    public static int length(Node<Integer> head){
        Node<Integer> temp=head;
        int count=0;

        while(temp!=null){
            count++;
            temp=temp.next;

        }return count;
    }
    public static void printIthNode(Node<Integer> head,int i){
        int position=0;
        Node<Integer> temp=head;
        while(temp!=null && position<i){
            temp=temp.next;
            position++;
        }
        if(temp!=null){
            System.out.println(temp.data);
        }
    }
    public static Node<Integer> takeInput(){
        Scanner sc=new Scanner(System.in);
        int data=sc.nextInt();
        Node<Integer> head=null;
        while(data!=-1){
            Node<Integer> currentNode=new Node<Integer>(data);
            if(head==null){
                head=currentNode;
            }else{
                Node<Integer> tail=head;
                while(tail.next!=null){
                    tail=tail.next;
                }
                tail.next=currentNode;
  
            }
            data=sc.nextInt(); 
        }
        return head;

    }

    public static Node<Integer> optimizeTakeInput(){
        Scanner sc=new Scanner(System.in);
        int data=sc.nextInt();
        Node<Integer> head=null,tail=null;
        while(data!=-1){
            Node<Integer> currentNode=new Node<Integer>(data);
            if(head==null){
                head=currentNode;
                tail=currentNode;
            }else{
                tail.next=currentNode;
                tail=currentNode;//tail=tail.next
            }
            data=sc.nextInt();
        }
        return head;  

    }

    public static Node<Integer> insert(Node<Integer> head,int pos,int data){
        int currPos=0;

        Node<Integer> newNode=new Node<Integer>(data);
        if(pos==0){
            newNode.next=head;
            head=newNode;
            return head;
        }
        Node<Integer> temp=head;
        while(temp!=null && currPos<(pos-1)){
            temp=temp.next;
            currPos++;

        }
        if(temp==null){
            return head;
        }newNode.next=temp.next;
        temp.next=newNode;
        return head;
    }

    public static Node<Integer> Insert(Node<Integer> head,int elem,int pos){
        Node<Integer> nodeToBeInserted=new Node<Integer>(elem);
        if(pos==0){
            nodeToBeInserted.next=head;
            head=nodeToBeInserted;//head=nodeToBeInserted;
            return head;//nodeToBeInserted;

        }else{
        int count=0;
        Node<Integer> prev=head;
        while(count<pos-1 && prev!=null){
            count++;
            prev=prev.next;
        }
        if(prev!=null){
            nodeToBeInserted.next=prev.next;
            prev.next=nodeToBeInserted;
        }
        return head;
    }
    }

    public static Node<Integer> deleteNode(Node<Integer> head,int pos){
        if(head==null){
            return head;
        }
        if(pos==0){
            return head.next;
        }
        int count=0;

        Node<Integer> currHead=head;
        while(currHead!=null && count<(pos-1)){
            currHead=currHead.next;
            count++;
        }
        if(currHead==null || currHead.next==null){
            return head;
        }
        currHead.next=currHead.next.next;
        return head;
    }

public static void printR(Node<Integer> head){
    Node<Integer> temp=head;
    if(temp==null){
        return;
    }
    System.out.print(temp.data+" ");
    printR(temp.next);
    //System.out.print(temp.data+" ");

} 

public static void printReverse(Node<Integer> head){
    Node<Integer> temp=head;
    if(temp==null){
        return ;
    }

    printReverse(temp.next);
    
    System.out.print(temp.data+" ");


}
















    public static void main(String[] args){

        //Node<Integer> head=createLinkedList();
       // System.out.println("Main "+head);
       Node<Integer> head=takeInput();
       //Node<Integer> head=optimizeTakeInput();
        //Node<Integer> newHead=
        //head=Insert(head,300,0);
        //head=deleteNode(head,0);

        printR(head);
        System.out.println(" ");
        printReverse(head);
        
        //increment(head);
        //print(head);
        //System.out.println("length "+length(head));
        //printIthNode(head,2);

        /* 
        Node<Integer> cur=head;
        while(cur!=null){
            System.out.println(cur.data);
            cur=cur.next;
        }
        
        Node<Integer> n1=new Node<>(10);
        System.out.println(n1);
        System.out.println(n1.data);
        System.out.println(n1.next);
        */
    }
    
}
