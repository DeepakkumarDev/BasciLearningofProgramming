public class ClassNotFoundExcept {
    public static void main(String[] args){
        try{
            Class.forName("NonExisctence Class");
        }
        catch(ClassNotFoundException e)
        {
            System.out.println("Class Not Found "+e);

        }
    }
    
}
