class Test{
    static{
        System.out.println("Block 1");
    }
    static
    {
        System.out.println("Block 2");
    }

}
public class StaticBlockTest {

        public static void main(String[] args) {
            Test t=new Test();
            System.out.println("Main");
            Test t2=new Test();
            System.out.println("Main");
        }

        
    }
    
