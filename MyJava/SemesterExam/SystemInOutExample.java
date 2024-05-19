import java.util.Scanner;
public class SystemInOutExample {
    public static void main(String[] args) {
        System.out.println("Hello , this is standard output!");

        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter something: ");
        String userInput=scanner.nextLine();
        System.out.println("You entered: "+userInput);
    }
    
}
