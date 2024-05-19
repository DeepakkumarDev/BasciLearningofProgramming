import java.util.ArrayList;
import java.lang.*;
import java.util.Arrays;
 
public class RemoveConsecutiveDuplicates {

    public static ArrayList<Integer> removeconsecutiveDuplicates(int arr[]){
         ArrayList<Integer> result=new ArrayList<>();
         result.add(arr[0]);
         for (int i=1;i<arr.length;i++){
            if(arr[i]!=arr[i-1]){
                result.add(arr[i]);
            }
         } return result; 
    }
    public static void main(String[] args){
        int arr[]={10,10,20,20,20,30,40,10};
        System.out.println(arr.toString());
        //ArrayList<Integer> result=new ArrayList<>();
        ArrayList<Integer> result=removeconsecutiveDuplicates(arr);
        System.out.println(result.toString());
        System.out.println(Arrays.toString(arr));
        for(int k=0;k<result.size();k++){
            System.out.println(result.get(k));
        }



    
}
}