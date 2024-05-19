import java.util.Stack;
public class QueueWithTwoStacks {
    private Stack<Integer> stack1=new Stack<>();
    private Stack<Integer> stack2=new Stack<>();

    public void enqueue(int item){
        stack1.push(item);
    }

    public int peek(){
        if(isEmpty()){
            throw new IllegalStateException();
        }
        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }
    public int dequeue(){
        if(isEmpty()){
            throw new IllegalStateException();
        }
        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
    public boolean isEmpty(){
        return stack1.isEmpty() && stack2.isEmpty();
    }
    public static void main(String[] args){
        QueueWithTwoStacks queue=new QueueWithTwoStacks();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.dequeue();
        queue.dequeue();
        var first=queue.dequeue();
        System.out.println(first);

    }
}
