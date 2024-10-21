/*Write a java code to print character pattern
 A
 BC
 DEF
 GHIJ
 KLMNO
 */
public class Pattern3 {
    public static void main(String[] args) {
        int n = 5;
        char ch = 'A';
        for (int i = 1; i <= n; i++) {
            for (int chr = 1; chr <= i; chr++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
