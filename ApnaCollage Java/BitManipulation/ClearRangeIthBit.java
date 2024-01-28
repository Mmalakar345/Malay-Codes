// Write a java code to show how to selected range of bit clear.

public class ClearRangeIthBit {

    public static int ClearOperation(int n, int i,int j){
        int a = (~0)<<(j+1);
        int b = (1<<i)-1;
        int bitMask = a | b;
        return n & bitMask;
    }

    public static void main(String[] args) {
        int find = ClearOperation(10,2,4);
        System.out.println(find);
    }
    
}
