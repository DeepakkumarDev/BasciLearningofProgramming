import java.util.*;
public class StringReverser {
    private final List<Character> leftBrackets = ArraysApplication.asList('(', '<', '[', '{');
    private final List<Character> rightBrackets = ArraysApplication.asList(')', '>', ']', '}');

    public String reverse(String input){
        if (input==null){
            throw new IllegalArgumentException();
        }
        Stack<Character> stack=new Stack<>();

        //for(int i=0;i<input.length();i++){
        //    stack.push(input.charAt(i));
        //}

        for(char ch:input.toCharArray()){
            stack.push(ch);
        }
        StringBuffer reversed=new StringBuffer();
        while(!stack.empty()){
            //reversed+=stack.pop();
            reversed.append(stack.pop());
        }
        return reversed.toString();
    }

    public boolean isBalanced(String input){
        Stack<Character> stack=new Stack<>();
        for(char ch : input.toCharArray()){
            //if(ch=='(' || ch=='<' || ch=='[' || ch=='{' ){
            if(isLeftBracket(ch)){

                stack.push(ch);
            }

           // if(ch==')' || ch=='>' || ch==']' || ch=='}'){
            if(isRightBracket(ch)){
                if(stack.empty()) return false;
                var top=stack.pop();
                if(!bracketMatch(top, ch)) return false;
                /* 
                if((ch==')' && top !='(' ) ||
                    (ch=='>' && top !='<' ) ||
                    (ch==']' && top !='[' ) ||
                    (ch=='}' && top !='{' )
                ){
                
                    return false;
                }
                */
            }
        }
        return stack.empty();
    }

    private boolean isLeftBracket(char ch){
        //return ch=='(' || ch=='<' || ch=='[' || ch=='{' ;
        //var leftBracket=Arrays.asList('(','<','[','{');
        return leftBrackets.contains(ch);

    }

    private boolean isRightBracket(char ch){
        //var rightBrackets=Arrays.asList((')'),'>',']','}');
        //return ch==')' || ch=='>' || ch==']' || ch=='}';
        return rightBrackets.contains(ch);
    }
    private boolean bracketMatch(char left,char right){
        return leftBrackets.indexOf(left)==rightBrackets.indexOf(right);
        /* 

        return  (right==')' && left !='(' ) ||
                (right=='>' && left !='<' ) ||
                (right==']' && left !='[' ) ||
                (right=='}' && left !='{' ) ;
                
                */

    }

    public static void main(String[] args){
        //String str="abcd";
        StringReverser reverser=new StringReverser();
        //var result=reverser.reverse(str);
        //System.out.println(result);
        String str="(1+2+1}";
        //Expression exp=new Expression();
        var exp= reverser.isBalanced(str);
        System.out.println(exp);

    }
    
}
