import java.io.IOException;
public class InputStreamExample {
    
    public static void main(String[] args) {
        
        try{
            System.out.println("Enter a Character: ");
            int charCode=System.in.read();
            System.out.println("ASCII code of yje entered character: "+charCode);
            
        }catch(IOException e){
            System.out.println("Error reading input :"+e.getMessage());
        }
    }
}
