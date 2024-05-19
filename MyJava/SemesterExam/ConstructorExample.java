// Parent class
class Parent {
    String parentName;

    // Parameterized constructor in the Parent class
    Parent(String name) {
        this.parentName = name;
        System.out.println("Parent constructor invoked with name: " + parentName);
    }
}

// Child class extending Parent
class Child extends Parent {
    //String childName;
    Child(){
    super("x");
    }
/* 
    // Parameterized constructor in the Child class
    Child(String parentName, String childName) {
        // Invoking the parameterized constructor of the Parent class using super()
        super(parentName);

        this.childName = childName;
        System.out.println("Child constructor invoked with name: " + childName);
    }

    // Another constructor in the Child class using this()
    Child(String childName) {
        // Invoking the parameterized constructor of the same class using this()
        this("DefaultParentName", childName);
    }*/
}

public class ConstructorExample {
    public static void main(String[] args) {
        // Creating an instance of Child with parameters
        Child childWithParent = new Child();

        //System.out.println(); // Line break for clarity

        // Creating an instance of Child with only child name (uses this() to call another constructor)
        //Child childWithoutParent = new Child("ChildNameWithoutParent");

        //System.out.println(); // Line break for clarity

        // Creating an instance of Child with only parent name (uses super() to call Parent constructor)
//        Child childWithDefaultParent = new Child("ParentNameOnly", "ChildNameOnly");
    }
}
