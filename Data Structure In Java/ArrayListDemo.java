import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args){
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(1,80);
        arr.set(0,100);
        int j=1;
        arr.remove(j);
        System.out.println(arr.size());
        System.out.println(arr.get(2));
        System.out.println(arr.toString());
          
        for (int i=0;i<arr.size();i++){
            System.out.println(arr.get(i));

        }
        for(int ele:arr){
            System.out.println(ele);
        }
    }
    
}
