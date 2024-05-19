import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame{
    Button b1,b2,b3,b4,b5,b6;


    public MyFrame()
    {
        /* 
        super("Layout");
        b1=new Button("One");
        b2=new Button("Two");
        b3=new Button("Three");
        b4=new Button("Four");
        b5=new Button("Five");
        b6=new Button("Six");
        FlowLayout fl=new FlowLayout();
        fl.setAlignment(FlowLayout.RIGHT);
        fl.setHgap(100);
        setLayout(fl);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        

        super("BoderLayout");
        b1=new Button("One");
        b2=new Button("Two");
        b3=new Button("Three");
        b4=new Button("Four");
        b5=new Button("Five");
        b6=new Button("Six");
        add(b1,BorderLayout.NORTH);
        //add(b2,BorderLayout.EAST);
        add(b3,BorderLayout.SOUTH);
        add(b4,BorderLayout.WEST);
        add(b5,BorderLayout.CENTER);
        Panel p=new Panel();
        p.setLayout(new GridLayout(3,1));
        p.add(new Button("Mon"));
        p.add(new Button("Tue"));
        p.add(new Button("Wed"));
        add(p,BorderLayout.EAST);
        //add(b6);
        */
        super("Grid Layout Demo");
        GridBagLayout gb=new GridBagLayout();
        GridBagConstraints gbc=new GridBagConstraints();
        setLayout(gb);
        //setLayout(new GridLayout(3,2));
        b1=new Button("One");
        b2=new Button("Two");
        b3=new Button("Three");
        b4=new Button("Four");
        b5=new Button("Five");
        b6=new Button("Six");
        gbc.gridx=1;
        gbc.gridy=1;
        add(b1,gbc);
        gbc.gridx=2;
        gbc.gridy=2;
        add(b2,gbc);
        gbc.gridx=3;
        gbc.gridy=3;
        add(b3,gbc);
        gbc.gridx=4;
        gbc.gridy=4;
        add(b4,gbc);
        gbc.gridx=5;
        gbc.gridy=5;
        add(b5,gbc);
        gbc.gridx=6;
        gbc.gridy=6;
        add(b6,gbc);
        //add(new Button("Seven"));
    }
};

public class LayoutManager {
    public static void main(String args[])
    {
        MyFrame f=new MyFrame();
        f.setSize(500,500);
        f.setVisible(true);
    }
};
