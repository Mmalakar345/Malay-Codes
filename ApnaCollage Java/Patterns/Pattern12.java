/* Write a java program to show this pattern.
    * 
   ***
  *****
 *******
  *****
   ***
    *
 */
public class Pattern12 {

    public static void diamond(int totalRows){
        //First half
        for(int i=1; i<=totalRows; i++){
            // spaces 
            for(int j = 1; j<=(totalRows-i); j++){
                System.out.print(" ");
            }
            // stars - i
            for(int j = 1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    
        //Second half
        for(int i=totalRows; i>=1; i--){
            // spaces
            for(int j = 1; j<=totalRows-i; j++){
                System.out.print(" ");
            }
            
            // stars
            for(int j = 1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
    }
}

    public static void main(String[] args) {
        diamond(8);
    }

}

