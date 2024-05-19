import java.awt.*;
public class FirstApp2 extends Frame {
    Label l;
    Button b;
    TextField tf;
    public FirstApp2(){
        super("My App");
        setLayout(new FlowLayout());
        l=new Label("Name");
        tf=new TextField(20);
        b=new Button("Ok");
        add(l);
        add(tf);
        add(b);

    }
    public static void main(String[] args){
        FirstApp2 fa=new FirstApp2();
        fa.setSize(400,400);
        fa.setVisible(true);

    }
    
}
