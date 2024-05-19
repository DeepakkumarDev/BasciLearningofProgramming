import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.Set;
public class HashTableUtil{
    public static char findFirstNonRepeatingChar(String str){
        Map<Character,Integer> map=new HashMap<>();
        var chars=str.toCharArray();
        for(var ch:chars){
            /* 
            if(map.containsKey(ch)){
                var count=map.get(ch);
                map.put(ch,count);
            }else{
                map.put(ch,1);
            }
            */
            var count=map.containsKey(ch) ? map.get(ch) :0;
            map.put(ch,count+1);
        }
        //System.out.println(map);
        for(var ch:chars){
            if(map.get(ch)==1){
                return ch;
            }
        }
        return Character.MIN_VALUE;
    }

    public static char findFirstRepeatedChar(String str){
        Set<Character> set=new HashSet<>();
        for(var ch:str.toCharArray()){
            if(set.contains(ch)){
                return ch;
            }
            set.add(ch);
        }
        return Character.MIN_VALUE;
    }
    public static void main(String[] args) {
        /* 
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"Mosh");
        map.put(2,"John");
        map.put(3,"Mary");
        map.put(3,"Marianne");
        map.put(null,null);
        map.remove(null);
        var value=map.get(3);
        System.out.println(value);
        System.out.println(map);
        System.out.println(map.containsKey(3));//O(1)
        System.out.println(map.containsValue("Mosh"));//O(n)
        for(var item:map.keySet()){
            System.out.println(item);
        }
        for(var item:map.entrySet()){
            System.out.println(item);
        }


        var ch=findFirstNonRepeatingChar("a green apple");
        System.out.println(ch);
        
        */

        /* 
        Set<Integer> set=new HashSet<>();
        int[] numbers={1,2,3,3,2,1,4};
        for(var number:numbers){
            set.add(number);
        }
        set.remove(4);
        set.contains(2);
        set.size();
        set.clear();
        System.out.println(set);
        
        var ch=findFirstRepeatedChar("green apple");
        System.out.println(ch);
        
        Map<Integer,String> map=new HashMap<>();
        map.put(123456,"Mosh");
        System.out.println(hash(123456));
        
        Map<String ,String> map=new HashMap<>();
        map.put("123456-A","Mosh");
        System.out.println(hash("123456-A"));
        */
        String str="orange";
        System.out.println(str.hashCode());
    }
    public static int hash(int number){
        return number%100;
    }
    public static int hash(String key){
        int hash=0;
        for(var ch:key.toCharArray()){
            hash+=ch;
        }
        return hash%100;
    }
}