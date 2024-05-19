/*public class Demo {
    static int a = 10;
    static int b;

    static void show(int x) {
        System.out.println("/ = " + x);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    static {
        System.out.println("Static block.");
        // Additional code or initialization can be placed here
        b=++a+a++;
    }

    public static void main(String[] args) {
        show(20);
    }
}
*/
/* 
public class Demo {
    Demo(int x) {
        System.out.print("Super class =" + x);
    }
}

class Sub extends Demo {
    Sub(int a, int b) {
        super(b);
        System.out.print("Sub class = " + a);
    }

    Sub(int x) {
        super(x);
        System.out.print("Sub class = " + x);
    }

    public static void main(String[] args) {
        new Sub(10, 20);
    }
}

public class Demo {
    void test() {
        System.out.println("No parameters");
    }

    void test(int a, int b) {
        System.out.println("a and b: " + a + " " + b);
    }

    double test(double a) {
        System.out.println("double a: " + a);
        return a * a;
    }

    public static void main(String[] args) {
        Demo ob = new Demo();
        ob.test();
        ob.test(127);
        ob.test(5, 10);
        double result = ob.test(10.11);
        System.out.println("Result: " + result);
    }
}
*/
public class Demo {
    public static void main(String[] args) {
        ram: for (int i = 0; i < 10; i = i + 2) {
            System.out.print("hi ");
            for (int b = 5; b < i; b = b + 2) {
                System.out.println("hello ");
            }
            for (int b = 5; b < i; b = b + 3) {
                System.out.println("bye ");
            }
            if (i > 7) {
                break ram;
            }
        }
    }
}
