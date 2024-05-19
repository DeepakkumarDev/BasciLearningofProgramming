public class Conversion {

    public static void main(String args[]){
        //Int to long conversion
        int intValue=10;
        long longValue=intValue;
        System.out.println("Int vale"+intValue);
        System.out.println("Long value After Conversion "+longValue);

        //Byte to Short Conversion
        byte byteValue=8;
        short shortvalue=byteValue;
        System.out.println("byte value "+byteValue);

        //Float to Long Conversipon
        float floatValue=(float) 12.34;
        long longValue1=(long) floatValue;
        System.out.println("float value : "+floatValue);
        System.out.println("Long after Conversion "+longValue1);

        //Short to Char Conversion 
        short shortValue=65;
        char charValue=(char) shortValue;
        System.out.println("short value"+shortValue);
        System.out.println("char value after conversion : "+charValue);

        //Boolean value
        boolean boolValue=true;
        System.out.println("Boolean Value : "+boolValue);
    }
    
}
