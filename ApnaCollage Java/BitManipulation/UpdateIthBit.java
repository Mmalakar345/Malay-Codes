// Write a java code to ith location set bit or clear bit to update number.
public class UpdateIthBit {

    public static int SetOperation(int n, int i){
        int bitMask = 1<<i;
        int setValue = n | bitMask;
        return setValue;
    }

    public static int ClearOperation(int n, int i){
        int bitMask = ~(1<<i);
        int setValue = n & bitMask;
        return setValue;
    }
    // Method one 
    public static int UpdateOperation(int n, int i, int newbit){
        if (newbit == 0){
            return ClearOperation(n, i);
        }
        else{
            return SetOperation(n, i);
        }

    }
    // Method two output same but working principle different
    public static int UpdateOperation1(int n, int i, int newbit){
        n = ClearOperation(n, newbit);
        int Bitmask = newbit<<i;
        return n | Bitmask;
    }

    public static void main(String[] args) {

        int Num1 = UpdateOperation(10,2,1);
        System.out.println(Num1);

        int Num2 = UpdateOperation1(10,5,1);
        System.out.println(Num2);
    }
    
}
