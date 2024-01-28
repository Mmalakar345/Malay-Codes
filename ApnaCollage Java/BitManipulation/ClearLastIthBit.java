// Write a java code to show how to clear last ith(quantity) bit.
public class ClearLastIthBit {

    public static int ClearOperation(int n, int i){
        int bitMask = (~0)<<i; // i index left shift operation
        int setValue = n & bitMask; // and operation clear the bit
        return setValue;
    }

    public static void main(String[] args) {
        int find = ClearOperation(15,2); // value pass and last two bit clear 
        System.out.println(find);
    }
    
}
