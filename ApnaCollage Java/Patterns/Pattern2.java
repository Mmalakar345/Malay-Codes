/*Write a java code to print half-pyramid pattern
 1
 12
 123
 1234
 12345
 */

public class Pattern2 {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 1; i<=n; i++){
            //numbers print
            for(int num=1; num<=i; num++){
                System.out.print(num);
            }
            System.out.println();
        }
    }
}
