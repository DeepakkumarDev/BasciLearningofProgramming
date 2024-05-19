public class StringPollingExample {
    public static void main(String[] args) {
        
        String str1="Hello";
        String str2="Hello";
        System.out.println("Example 1: ");
        System.out.println("str1==str2 : "+(str1==str2));
        String str3=new String("Java");
        String str4=new String("Java");
        System.out.println("\nExample 2");
        System.out.println("str3==str4 : "+(str3==str4));
        String str5=new String("Pool").intern();
        String str6="Pool";
        System.out.println("\nExample 3");
        System.out.println("str5==str6 : "+(str5==str6));
    }
    
}
