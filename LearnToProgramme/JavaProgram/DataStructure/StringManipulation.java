import java.lang.*;
import java.util.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
class StringUtils{
    public int countVowels(String str){
        if(str==null){
            return 0;
        }
        int count=0;
        String vowels="aeiou";
        for(var ch:str.toLowerCase().toCharArray()){
            if(vowels.indexOf(ch)!=-1){
                count++;
            }
        }
        return count;
    }

    public String reverseString(String str){
        if(str==null){
            return "";
        }
        //String reversed="";

        StringBuilder reversed=new StringBuilder();

        for(var i=str.length()-1;i>=0;i--){
            //reversed+=str.charAt(i);
            reversed.append(str.charAt(i));

        }
        //return reversed;
        return reversed.toString();
    }

    public String reverseWords(String sentence){
    
        if(sentence==null){
            return "";
        }
        String[] words=sentence.trim().split("\\s+");
        Collections.reverse(Arrays.asList(words));

        return String.join(" ",words);
    }
        /* 
        StringBuilder reversed=new StringBuilder();
        for(var i=words.length-1;i>=0;i--){
            reversed.append(words[i]+" ");
        }

        return reversed.toString().trim(); 
        */

    public boolean areRotation(String str1,String str2){
        if(str1==null || str2==null){
            return false;
        }
        return (str1.length()==str2.length() && (str1+str2).contains(str2));
        /* 
        if(str1.length()!=str2.length()){
            return false;
        }
        if(!(str1+str2).contains(str2)){
            return false;
        }
        return true;
        */
    }        
    public String removeDuplicates(String str){
        if(str==null)
        {
            return "";
        }
        StringBuilder output=new StringBuilder();
        Set<Character> seen=new HashSet<>();
        for(var ch:str.toCharArray()){
            if(!seen.contains(ch)){
                seen.add(ch);
                output.append(ch);
            }

        }
        return output.toString();
    }

    public char getMaxOccuringChar(String str){

        if(str.isEmpty() || str==null){
            throw new IllegalArgumentException();
        }

        final int ASCII_SIZE=256;
        int[] frequencies=new int[ASCII_SIZE];
        for(var ch:str.toCharArray()){
            frequencies[ch]++;
        }
        int max=0;
        char result=' ';
        for(var i=0;i<frequencies.length;i++){
            if(frequencies[i]>max){
                max=frequencies[i];
                result=(char) i;
            }

        }
        return result;

        /* 
        Map<Character,Integer> frequencies=new HashMap<>();
        for(var ch:str.toCharArray()){
            if(frequencies.containsKey(ch)){
                frequencies.replace(ch,frequencies.get(ch)+1);
            }
            else{
                frequencies.put(ch,1);
            }

        }
        */
    }

    public String capitalize(String sentence){
        if(sentence==null || sentence.trim().isEmpty())
            return "";

        String[] words=sentence.trim().replaceAll(" +"," ").split(" ");//split("\\s+")
        for(var i=0;i<words.length;i++){
           words[i]=words[i].substring(0,1).toUpperCase()+words[i].substring(1).toLowerCase();

        }
        return String.join(" ",words);
    }

    public boolean areAnagrams(String first,String second){
        if(first==null || second==null || first.length()!=second.length()){
            return false;
        }
        var array1=first.toLowerCase().toCharArray();
        Arrays.sort(array1);
        var array2=second.toLowerCase().toCharArray();
        Arrays.sort(array2);
        return Arrays.equals(array1,array2);

    }

    public boolean areAnagram2(String first,String second){
        if(first==null || second==null){
            return false;
        }
        final int ENGLISH_ALPHABET=26;
        int[] frequencies=new int[ENGLISH_ALPHABET];
        first=first.toLowerCase();
        for(var i=0;i<first.length();i++){
            frequencies[first.charAt(i)-'a']++;
        }
        second=second.toLowerCase();
        for(var i=0;i<second.length();i++){
            var index=second.charAt(i)-'a';
            if(frequencies[index]==0){
                return false;
            }
            frequencies[index]--;
        }

        return true;

    }

    public boolean isPalindrome(String word){
 
        |
        if(word==null){
            return false;
        }
        int left=0;
        int right=word.length()-1;
        while(left<right){
            if(word.charAt(left++)!=word.charAt(right--))
            {
                return false;
            }
            //left++;
            //right--;
        }
        return true;

        /* 
         var input=new StringBuilder(word);
         input.reverse();
         return input.toString().equals(word);
         */

    }

};
public class StringManipulation {
     public static void main(String[] args){
        var str=new StringUtils();
        /* 
        int count=str.countVowels(null);
        //String st=str.reverseString("Hello world");
        String st="   Hello         World";

        System.out.println(str.reverseWords(st));
        System.out.println(count);
        boolean b=str.areRotation("ABCD", "BDCA");
        System.out.println("Are Rotation result : "+b);
        var rd=str.removeDuplicates("Trees are beautiful");
        System.out.println(rd);
        var moc=str.getMaxOccuringChar("asgfer ffhifegifeg fiegifiiefhv fviefhgiefgh");
        System.out.println("getMostOccuringChar : "+moc);
        var cap=str.capitalize("          today is the great day");
        System.out.println(cap);
        
        var ang=str.areAnagrams("ABCD", "DBCAA");
        System.out.println(ang);
        
        var paln=str.isPalindrome("ABBA");
        System.out.println(paln);
        */
    }
}
