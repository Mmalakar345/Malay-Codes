/* Write a java program to print this pattern.
******
*    *
*    *
*    *
******
 */
public class Pattern1 {

    public static void hollo_Ractangle(int totalRows, int totalCols){
        // outer loop count rows
        for(int i=1; i<=totalRows; i++){
            // inner loop count columns
            for(int j=1;j<=totalCols; j++ ){
                // cell (i,j)
                if(i == 1 || i == totalRows || j ==  1 || j == totalCols){
                    //Boundary cell count
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        hollo_Ractangle(5,6);
    } 
}
