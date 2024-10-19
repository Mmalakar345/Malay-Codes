// write a java code to show call by value function with a example.

public class CallByvalue {
    public static void Swaping(int a, int b) {
        // copy a b
        // copy varibles value change only the Swaping() function not only whole progrram
        //// Swaping - values excange
        int temp = a;
        a = b;
        b = temp;
 
        System.out.println("a is = " + a); // here the swap value print
        System.out.println("b is  = " + b); // here the swap value print
        System.out.println();
    }

    public static void main(String[] args) {
        // orginal a b
        int a = 5;
        int b = 10;

        Swaping(a, b); // the copy varible is called as "call by value"

        System.out.println("a is = " + a); // here the orginal value print
        System.out.println("b is  = " + b); // here the orginal value print
    }
}
