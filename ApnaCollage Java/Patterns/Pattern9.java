/* Write a java program to print this pattern.
*        *
**      **
***    ***
****  ****
**********
**********
****  ****
***    ***
**      **
*        *
 */
public class Pattern9 { 

    public static void butterfly(int totalRows){
        //First half
        for(int i=1; i<=totalRows; i++){
            // stars - i
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            // spaces - 2*(totalRows - i)
            for(int j = 1; j<=2*(totalRows-i); j++){
                System.out.print(" ");
            }
            // stars - i
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    
        //Second half
        for(int i=totalRows; i>=1; i--){
            // stars - i
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            // spaces - 2*(totalRows - i)
            for(int j = 1; j<=2*(totalRows-i); j++){
                System.out.print(" ");
            }
            // stars - i
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        butterfly(5);
    }

}

