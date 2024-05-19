final class Test{
    public final void show(){
        System.out.println("Hello");
    }

}
/* 
class Test1 extends Test{//it cannot be extends since it is final
    public void show1(){

    }
}
*/
public class FinalDemo {
    /*
     final float PI=3.1425f;

     final float PI;
     {
        PI=3.1425f;
     }
     */

    /* 
    static final float PI;
    //PI=3.1425f;
    static
    {
        PI=3.1425f;
    }
    */
    final float PI=3.1425f;
    FinalDemo(){
        PI=3.1425f;
    }
    public static void main(String[] args) {
        final int x=10;
        //final float PI;
        //PI=3.1425f;
        //System.out.println();

    }
    
}
