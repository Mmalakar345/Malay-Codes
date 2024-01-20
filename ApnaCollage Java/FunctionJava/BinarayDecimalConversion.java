//Write a java program to find binary to Decimal conversion using function method.

public class BinarayDecimalConversion {

    public static void BinaryToDecimal(int binum){
        int binary = binum;
        int pow = 0;
        int decimal = 0;

        while(binum>0){
            int lastdigit = binum % 10;
            decimal = decimal + (lastdigit * (int)Math.pow(2,pow)); // Binary base no 2 so 2's power find.
            pow++;
            binum = binum/10;
        }
        System.out.println("Decimal of "+binary+" is = "+decimal);
    }


    public static void main(String[] args) {
        BinaryToDecimal(1010);
    }  
}
