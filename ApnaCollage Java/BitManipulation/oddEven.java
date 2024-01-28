// Write a java code to find a number is odd or even with the help of bitwise operator.
public class oddEven {

    public static void CheckEvenOdd(int n){
        int bitMask = 1;
        if ((n & bitMask) == 0){
            System.out.println("It is a Even Number");
        } else{
            System.out.println("It is a odd Number");
        }
    }
    public static void main(String[] args) {
        CheckEvenOdd(125);
        CheckEvenOdd(22);
        CheckEvenOdd(3);
    }
    
}
