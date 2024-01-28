// Write a java code to find ith location bit 0 or 1.
public class GetIthBit {

    public static int GetOperation(int n, int i){
        int bitMask = 1<<i;
        if ((n & bitMask) == 0){
            return 0;
        } else{
            return 1;
        }
    }

    public static void main(String[] args) {
        int find = GetOperation(15,2);
        System.out.println(find);
    }
    
}
