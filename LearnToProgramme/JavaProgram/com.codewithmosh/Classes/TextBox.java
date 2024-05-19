//package com.codewithmosh;
public class TextBox{
    public String text="";//Field
    public void setText(String text)
    {
        this.text=text;
    }

    public void clear(){
        this.text="";
    }
    /* 
    public static void main(String[] args){
        var textBox1=new TextBox();
        //textBox1.setText("Box 1");
        //System.out.println(textBox1.text.toUpperCase());
        //var textBox2=new TextBox();
        //textBox2.setText("Box 2");
        //System.out.println(textBox2.text.toLowerCase());

        var textBox2=textBox1;
        textBox2.setText("Hello world");
        System.out.println(textBox1.text);
    }  
    */
}