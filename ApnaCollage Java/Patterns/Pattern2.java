/* Write a java program to print this pattern.
1
01
101
0101
10101
 */

public class Pattern2 {

    public static void zero_one_tringle(int totalRows){

        // outer loop count rows
        for(int i=1; i<=totalRows; i++){
            // inner loop count columns
            for(int j=1;j<=i; j++ ){
                // cell (i,j)
                if((i+j) % 2 == 0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        zero_one_tringle(5);
    }
    
}
