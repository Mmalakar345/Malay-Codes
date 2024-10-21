/* Write a java program to print this pattern.
Inverted_half_pyramid with numbers
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
 */


public class Pattern6 {

    public static void Inverted_half_pyramid(int n){
        for(int i=1; i<=n; i++){
            // inner loop - numbers
            for(int j = 1; j<=n-i+1; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Inverted_half_pyramid(5);
    }
}
