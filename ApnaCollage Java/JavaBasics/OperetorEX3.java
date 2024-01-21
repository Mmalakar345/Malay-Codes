// writea java program to show Operator example
public class OperetorEX3 {
    public static void main(String args []){
      
        int x, y, z;
        x = y = z = 2;
        x += y; // becase of int value (x=x+y) => (2 + 2) => (4)

        y -= z; // becase of int value (y=y-z) => (2-2) => (0)

        z /= (x + y); // becase of int value (2/(4+0)) => (2/4) => (0.5) => 0

        System.out.println(x + " " + y + " " + z);
    } 
}
