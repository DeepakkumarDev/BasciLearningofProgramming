import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.Stack;
import java.util.*;

public class QueuesUtil {
    public static void reverse(Queue<Integer> queue){
        Stack<Integer> stack=new Stack<>();
        while(!queue.isEmpty()){
            stack.push(queue.remove());
        }
        while(!stack.isEmpty()){
            queue.add(stack.pop());
        }
    }


    public static void main(String[] args){
        /* 
        Queue<Integer> q=new Queue<Integer>(){
            @Override
            public boolean add(Integer integer){
                return false;
            }
        }
        */
        Queue<Integer> queue=new ArrayDeque<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        var front=queue.remove();
        System.out.println("front "+ front);
        System.out.println(queue);
        reverse(queue);
        System.out.println(queue);

    
    }
}