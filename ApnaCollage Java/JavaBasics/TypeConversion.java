/*What will be the type of result in thefollowing Java code?
 (Hint : Look at the largest data type among these)
 */

 public class TypeConversion{
    public static void main(String args []){
        byte b = 4;
        char c = 'a';
        short s = 512;
        int i = 1000;
        float f = 3.14f;
        double d = 99.9954;

        double result = (f * b) + (i * c) + (d * s);
        System.out.print(result);
    }
 }