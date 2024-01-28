/* Write a java code to find a to the power of n, with the help of FastExpontiation.
example 3 to the power of 5 = 243 
 */
public class FastExponentiation {

    public static void FastExpo(int a, int n){
        int ans = 1;
        while (n > 0) {
            if ((n & 1) != 0){ // check LSB 1 or 0
                ans = ans * a;
            }
            a = a * a; // count a Square
            n = n>>1; // n right shift 1 time
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        FastExpo(5,3); // method call
    }
}
