import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame implements ActionListener{
    Label l;
    TextArea ta;
    TextField tf;
    Button b;
    public MyFrame(){
        super("Text Area Demo");
        l=new Label("         ");
        ta=new TextArea(10,20);
        tf=new TextField(20);
        b=new Button("Click");
        setLayout(new FlowLayout());

        add(ta);
        add(l);
        add(tf);
        add(b);
        b.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae){
        //l.setText(ta.getSelectedText());
        //ta.append(tf.getText());
        ta.insert(tf.getText(),ta.getCaretPosition());
    }

}
public class TextAreaDemo {
    
    public static void main(String[] args){
        MyFrame f=new MyFrame();
        f.setSize(300,400);
        f.setVisible(true);
    }
}
