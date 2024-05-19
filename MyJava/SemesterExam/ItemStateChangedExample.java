import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ItemStateChangedExample extends Frame implements ItemListener{
    Checkbox checkbox;
    public ItemStateChangedExample(){
        checkbox=new Checkbox("Check me");
        setLayout(new FlowLayout());
        checkbox.setBounds(100,100,50,50);
        add(checkbox);
        checkbox.addItemListener(this);
    
    }
    public void itemStateChanged(ItemEvent e){
        System.out.println("Checkbox state changed");

    }

    public static void main(String args[]){
        ItemStateChangedExample f=new ItemStateChangedExample();
        f.setSize(300,300);
        f.setVisible(true);
    }

    
}
