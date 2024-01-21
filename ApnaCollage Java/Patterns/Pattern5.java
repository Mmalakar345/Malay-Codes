/*Write a java program to show this pattern.
     *****
    *   *
   *   *
  *   *
 *****
 */
public class Pattern5 {

    public static void hollow_rhombos(int totalRows){
        for(int i=1; i<=totalRows; i++){
            // spaces
            for(int j = 1; j<=totalRows-i; j++){
                System.out.print(" ");
            }
            // hollow rectangle stars
            for(int j = 1; j<=totalRows; j++){
                if (i == 1 || i == totalRows || j == 1 || j == totalRows){
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
        hollow_rhombos(8);
    }

}
