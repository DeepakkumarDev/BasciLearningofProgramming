import java.util.PriorityQueue;
public class PriorityQueueUtil {
    public static void main(String[] args){
        PriorityQueue<Integer> queue=new PriorityQueue<>();
        queue.add(5);
        queue.add(1);
        queue.add(3);
        queue.add(2);
        System.out.println(queue);
        while(!queue.isEmpty()){
            System.out.println(queue.remove());
        }

    }
    
}
