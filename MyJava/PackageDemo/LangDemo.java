//package langdemo;
import java.lang.*;

class MyObject{
    public String toString(){
        return "My Object";
    }

    public int hashCode(){
        return 100;
    }
    public boolean equals(Object o){
        return this.hashCode()==o.hashCode();
    }

}
class MyObject2 extends MyObject{

}
public class LangDemo {
    
    public static void main(String args[]){
        Object o1=new Object();
        Object o2=new Object();
        Object o3=o1;
        System.out.println(o1);
        System.out.println(o1.toString());
        System.out.println(o1.equals(o2));
        System.out.println(o1.equals(o3));
        System.out.println(o1.equals(o1));
        System.out.println(o1.hashCode());
        MyObject mob=new MyObject();
        System.out.println(mob);
        MyObject mob1=new MyObject();
        System.out.println(mob.equals(mob1));


    }
}
