/* Write a java code to show how to count a number's have how much set bit(1).
 example 10 = 1010 binary form
 count set of bit is = 2.
*/
public class CountSetBits {

    public static void SetofBits(int n){
        int count = 0;
        while ((n > 0)) {
            if((n & 1) != 0){ // check lsb = 0 or 1
                count++;
            }
            n = n >> 1;
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        SetofBits(100000);
    }
}
