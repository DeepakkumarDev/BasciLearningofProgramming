abstract class Animal{
    abstract void makeSound();
}
interface Herbivore{
    void eatPlants();
}
 

public class AbstractAndInterfaceExample extends Animal implements Herbivore {
    public void makeSound(){
        System.out.println("Animal make a sound");
    }
    public void eatPlants(){
        System.out.println("Animal eats plants");
    }
    public static void main(String[] args) {
        AbstractAndInterfaceExample animal=new AbstractAndInterfaceExample();
        animal.makeSound();
        animal.eatPlants();
        
    }
    
}
