// Write a java code to set ith location bit to 1.
public class SetIthBit {

    public static int SetOperation(int n, int i){
        int bitMask = 1<<i;
        int setValue = n | bitMask;
        return setValue;
    }

    public static void main(String[] args) {
        int find = SetOperation(10,2);
        System.out.println(find);
    }
    
}
