public class QuestionTwo2 {
    public static void main(String[] args) {
        
        byte a=20;
        byte b=10;
        if(a++>20 && ++b<=11){
            System.out.println("Hello");
        }
        System.out.println(a+" "+b);
        a=20;
        b=10;
        if(a++>20 && ++b<11){
            System.out.println("Hi");
        }
        System.out.println(a+"  "+b);

    }
    
}
