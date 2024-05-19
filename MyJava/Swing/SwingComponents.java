import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class MyFrame extends JFrame implements ActionListener
{
    JLabel l;
    JButton b;
    int count=0;
    MyFrame()
    {
        super("Swing Demo");
        setLayout(new FlowLayout());
        l=new JLabel("Clicked "+count+" Times");
        b=new JButton("Click");
        add(l);
        add(b);
        add(new JButton("Cancel"));
        b.addActionListener(this);
        getRootPane().setDefaultButton(b);
        b.setIcon(new ImageIcon("sim.avif"));
        l.setToolTipText("Counter");
    }
    public void actionPerformed(ActionEvent ae)
    {
        count++;
        l.setText("Clicked "+count+" times");
    }
}

public class SwingComponents {
    public static void main(String args[]){

        MyFrame f=new MyFrame();
        f.setSize(500,500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
