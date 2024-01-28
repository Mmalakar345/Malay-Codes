
// Write a java code to Check if a number is a power of 2 or not
public class CheckPowerOrNot {

    public static boolean Check(int n){
        return (n & (n-1)) == 0; // power of 2 or not condition checking
    }
    public static void main(String[] args) {
        boolean ans = Check(15);
        System.out.println("15 is = "+ans);

        System.out.println("16 is = "+Check(16));
    }
    
}
