// Write a java code to show how to clear a bit
public class ClearIthBit {

    public static int ClearOperation(int n, int i){
        int bitMask = ~(1<<i); // i index left shift operation
        int setValue = n & bitMask; // and operation clear the bit
        return setValue;
    }

    public static void main(String[] args) {
        int find = ClearOperation(10,1); // value pass and clear bit index no 1
        System.out.println(find);
    }
    
}
