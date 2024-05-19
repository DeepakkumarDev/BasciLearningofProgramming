import java.awt.*;
class MyFrame extends Frame{
    Label l;
    Button b;
    TextField tf;
    public MyFrame(){
        super("My Appp");
        setLayout(new FlowLayout());
        l=new Label("Name");
        tf=new TextField(20);
        b=new Button("Ok");

        add(l);
        add(tf);
        add(b);

    }

}
public class FirstApp1 {
    public static void main(String args[]){
        MyFrame mf=new MyFrame();
        mf.setSize(400,400);
        mf.setVisible(true);

    }
    
}
