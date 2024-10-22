// Write a java code to show how to change array elements using pass arguments by referance.

package ArrayCodes;

public class ArrayAsArguments {

    public static void update(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 5; // that place value change & thae changes
            // show into output or real array value change also (marks[])
        }
    }

    public static void main(String[] args) {
        int marks[] = { 85, 92, 71 };
        update(marks); // array pass by referance so that value always change


        for (int i = 0; i < marks.length; i++) {
           System.out.print(marks[i]+" ");
        }
    }
}
