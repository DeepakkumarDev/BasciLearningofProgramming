import java.util.LinkedList;
import java.util.Arrays;
import java.util.ArrayList;
public class LinkedListAppl {

    public static void main(String[] args){
        LinkedList list=new LinkedList();
        list.addLast(10);
        list.addLast(10);
        list.addLast(30);
        list.addFirst(5);
        //list.removeFirst();
        //list.removeLast();
        //System.out.println(list.contains(10));
        //System.out.println(list.indexOf(10));
        //System.out.println(list.size());
        //System.out.println(list);
        var array=list.toArray();
        System.out.println(Arrays.toString(array));
        list.reversed();
        var revArray=list.toArray();
        System.out.println(Arrays.toString(revArray));



        
    }
    
}

