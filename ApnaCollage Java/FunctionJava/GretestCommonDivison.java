/*Instructions
Greatest Common Divisor (GCD). Write a function named findGCD that takes two integers as 
input and returns their greatest common divisor (GCD). Use this function to find the 
GCD of two given numbers. int gcdResult = findGCD(36, 48);
// Sample Output: gcdResult = 12
*/
public class GretestCommonDivison {

    public static int GCD(int num1, int num2){
        int maximum = 0;
        for(int i=1; i<=num1/2; i++){
            if (num1%i == 0 && num2%i == 0){
                maximum = i;}
        }
        return maximum;
    }

    public static void main(String[] args) {
        int value = GCD(108,222);
        System.out.println("GCD Result is = "+value);
        
    }  
}
