import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements ItemListener,ActionListener{
    List l;
    Choice c;
    TextArea ta;
    public MyFrame(){
        super("ListBox Demo");
        l=new List(6,true);
        c=new Choice();
        ta=new TextArea(20,30);
        l.add("Monday");
        l.add("tuesday");
        l.add("Wednesday");
        l.add("Thursday");
        l.add("Friday");
        l.add("Saturday");
        l.add("Sunday");

        c.add("January");
        c.add("February");
        c.add("March");
        c.add("April");

        setLayout(new FlowLayout());
        add(l);
        add(c);
        add(ta);
        l.addItemListener(this);
        c.addItemListener(this);
        l.addActionListener(this);
        setSize(500,500);
        setVisible(true);
    }

    public void itemStateChanged(ItemEvent ie){
        if(ie.getSource()==l){
            ta.setText(l.getSelectedItem());
        }else{
            ta.setText(c.getSelectedItem());
        }
    }

    public void actionPerformed(ActionEvent ae){
        String list[]=l.getSelectedItems();
        String txt="";
        for(String x:list){
            txt+=x+"\n";
        }
        ta.setText(txt);
    }

}

public class First{
    public static void main(String[] args){
        MyFrame f=new MyFrame();
    }
}



/*

import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame implements ActionListener{
    Label l;
    TextArea ta;
    TextField tf;
    Button b;
    public MyFrame(){
        super("text Area Demo");
        l=new Label("      ");
        ta=new TextArea(10,20);
        tf=new TextField(20);
        b=new Button("click ");
        setLayout(new FlowLayout());
        add(ta);
        add(l);
        add(tf);
        add(b);
        b.addActionListener(this);
        setSize(500,500);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        l.setText(ta.getSelectedText());
        ta.append(tf.getText());
        //ta.insert(tf.getText(),ta.getCaretPosition());
    }

}

public class First{
    public static void main(String[] args){
        MyFrame f=new MyFrame();
    }
}





import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame{
    Label l1,l2;
    TextField tf;
    public MyFrame(){
        super("Text Field Demo ");
        l1=new Label("No Text is Enter yet");
        l2=new Label("Enter key is not hit yet ");
        tf=new TextField(20);
        tf.setEchoChar('*');
        Handler h=new Handler();
        tf.addTextListener(h);
        tf.addActionListener(h);

        setLayout(new FlowLayout());
        add(l1);
        add(tf);
        add(l2);
        setSize(500,500);
        setVisible(true);
    }
    class Handler implements TextListener,ActionListener{
        public void textValueChanged(TextEvent te){
            l1.setText(tf.getText());
        }
        public void actionPerformed(ActionEvent ae){
            l2.setText(tf.getText());
        }
    }
}
public class First{
    public static void main(String [] args){
        MyFrame f=new MyFrame();
    }
}


import java.awt.*;
import java.awt.event.*;
import java.lang.String;
import java.util.*;

class MyFrame extends Frame implements ItemListener{
    Label l;
    Checkbox c1,c2,c3;
    CheckboxGroup cbg;
    public MyFrame(){
        super("Check Box Demo");
        l=new Label("   Nothing is Selected   ");
        cbg=new CheckboxGroup();
        c1=new Checkbox("Java",false,cbg);
        c2=new Checkbox("Python",false,cbg);
        c3=new Checkbox("C#",cbg,false);
        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);
        setLayout(new FlowLayout());
        add(l);
        add(c1);
        add(c2);
        add(c3);

        setSize(500,500);
        setVisible(true);
    }
    public void itemStateChanged(ItemEvent e){
        String str="";
        if(c1.getState()){
            str=str+c1.getLabel();
        }
        if(c2.getState()){
            str=str+c2.getLabel();
        }
        if(c3.getState()){
            str=str+c3.getLabel();
        }
        if (str.isEmpty()){
            str = "Nothing Is Selected     ";
        }

        l.setText(str);
    }
}

public class First{
    public static void main(String args[]){
        MyFrame f=new MyFrame();

    }
}


import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements ActionListener{
    int count=0;
    Label l;
    Button b;
    public MyFrame(){
        super("My button Demo");
        setLayout(new FlowLayout());
        l=new Label("  "+count);
        b=new Button("Ok");
        add(l);
        add(b);
        b.addActionListener(this);
        setSize(400,400);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        count++;
        l.setText("  "+count);
    }

}

public class First{
    public static void main(String[] args){
        MyFrame f=new MyFrame();
    }
}



import java.awt.*;

public class First extends Frame{
    Label l;
    Button b;
    TextField f;
    public First(){
        super("My App");
        setLayout(new FlowLayout());
        l=new Label("Name");
        f=new TextField(20);
        b=new Button(" Ok ");

        add(l);
        add(f);
        add(b);
        setSize(400,400);
        setVisible(true);

    }
    public static void main(String str[]){
        First f=new First();
    }
}

import java.awt.*;
class MyFrame extends Frame{
Label l;
Button b;
TextField tf;
public MyFrame(){
    super("My App");
    setLayout(new FlowLayout());
    l=new Label("Name");
    tf=new TextField(20);
    b=new Button("Ok");
    add(l);
    add(tf);
    add(b);
    setSize(400,400);
    setVisible(true);
}
}

public class First{
    public static void main(String[] args){
        MyFrame mf=new MyFrame();
    }
}




import java.awt.*;
public class First {
    public static void main(String[] args){
        Frame f=new Frame("MyFirst App");
        f.setLayout(new FlowLayout());
        Button b=new Button(" Ok ");
        Label l=new Label("Name");
        TextField tf=new TextField(20);
        f.add(l);
        f.add(tf);
        f.add(b);
        f.setSize(300,300);
        f.setVisible(true);
    }

}
*/