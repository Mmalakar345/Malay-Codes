/* Write a java cote to show the pattern
 * 
 **
 ***
 ****
 *****
 */

public class Pattern0
{
    public static void main(String[] args) {
        for (int line = 1; line <= 5; line++) {
            // one line print
            for (int str = 1; str <= line; str++) {
                System.out.print("*");
            }
            System.out.println(); // next line
        }
    }
}
