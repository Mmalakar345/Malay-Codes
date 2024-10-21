/*Write a java code to show inverted pattern stars
 *****
 ****
 ***
 **
 *
 */

public class Pattern1 {
    
    public static void main(String[] args) {
        int n = 5;
        for(int i = 1; i<=n; i++){
            for(int str=1; str<=(n-i+1); str++){

                System.out.print("*");
            }
            System.out.println();
        }
    }
}
