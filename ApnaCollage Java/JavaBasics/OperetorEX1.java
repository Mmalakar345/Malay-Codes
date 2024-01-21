// writea java program to show Operator example
public class OperetorEX1 {
    public static void main(String args []){
        int x = 2; int y=5;

        int exmp1 = (x * y / x);
        int exmp2 = (x * (y / x)); // beacuse of integer pre defined so (2 * 2.5) => (2 * 2) => 4

        System.out.println(exmp1);
        System.out.println(exmp2);
    }  
}
