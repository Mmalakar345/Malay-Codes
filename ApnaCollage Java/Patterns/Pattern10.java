/*Write a java program to show this pattern.

     *****
    *****
   *****
  *****
 *****
 
 */
public class Pattern10 { 

    public static void solid_rhombos(int totalRows){
        for(int i=1; i<=totalRows; i++){
            // spaces
            for(int j = 1; j<=totalRows-i; j++){
                System.out.print(" ");
            }
            // stars
            for(int j = 1; j<=totalRows; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        solid_rhombos(8);
    }

}

