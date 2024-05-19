class Car{
    String brand="Tyota";
}
class SportsCar extends Car{
    String brand="Ferari";

}
public class VariableHidingExample {
    public static void main(String[] args) {
        Car myCar=new SportsCar();
        System.out.println("Brand "+myCar.brand);
    }
    
}
