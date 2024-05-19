abstract class My{
    abstract public void show();
}
//interface My{public void show();}

class Outer{
    int x=10;
    static int y=20;
    static class Myinner{
        public void show(){
            System.out.println(y);
        }
    }
    public void display(){
        My m=new My(){
            public void show(){
                System.out.println("Hello of abstract method");
            }
        };
        m.show();
        new My(){
            public void show(){
                System.out.println("Hello of abstract anonyms method");
            }
        }.show();
        class Inner{
            public void show(){
                
                System.out.println("Hello");
            }
        }
        new Inner().show();
        Inner i=new Inner();
        i.show();
    }
}

public class LocalInner {
    public static void main(String[] args) {
        
        Outer o=new Outer();
        o.display();
        Outer.Myinner mi=new Outer.Myinner();
        mi.show();
    }
    
}
