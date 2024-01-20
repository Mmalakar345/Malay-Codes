//Write a java program to find Decimal to binary conversion using function method.
public class DecimalToBinaryConversion {

    public static void DecimalToBinary(int dec){
        int decimal = dec;
        int pow = 0;
        int binary = 0;
        while ((dec>0)) {
            int remender = dec%2;
            binary = binary + remender * (int)Math.pow(10,pow); // decimal base no 10 so 10's power find.
            pow++;
            dec = dec/2;  
        }
        System.out.println("Binary of "+decimal+" is = "+binary);

    }
    public static void main(String[] args) {
        DecimalToBinary(12);
    }  
}
