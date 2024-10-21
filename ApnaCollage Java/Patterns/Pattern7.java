/* Write a java program to print this pattern.
Floyd's triangle with series numbers
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
 */


public class Pattern7 {

    public static void Floyds_triangle(int n){
        int counter = 1;
        // outer
        for(int i=1; i<=n; i++){
            // inner loop - How many times will counter be printed
            for(int j = 1; j<=i; j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Floyds_triangle(5);
    }
}
