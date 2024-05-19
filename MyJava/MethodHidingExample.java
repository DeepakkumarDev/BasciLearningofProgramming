class Animal{
    static void show(){
        System.out.println("Static method in Animal class");

    }
}
class Dog extends Animal{
    static void show(){
        System.out.println("Static method in Dog class");
    }
}
public class MethodHidingExample {
    public static void main(String[] args) {
        Animal.show();
        Dog.show();

    }
    
}
