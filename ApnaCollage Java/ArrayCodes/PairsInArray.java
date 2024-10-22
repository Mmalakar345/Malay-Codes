/* Write a java to print pairs in array
input = {2, 4, 6, 8, 10}
output = 
{(2,4) (2,6) (2,8) (2,10)}
{(4,6) (4,8) (4,10)}
{(6,8) (6,10)}
{(8,10)}
Total pairs are = 10
 */
package ArrayCodes;

public class PairsInArray {
    public static void PrintPairs(int numbers[]){
        int totalPair = 0;
        for(int i=0; i<numbers.length; i++){
            int current = numbers[i]; //2, 4, 6, 8, 10
            for(int j=i+1; j<numbers.length; j++){
                System.out.print("(" + current + "," + numbers[j] + ")");
                totalPair++;
            }
            System.out.println();
        }
        System.out.println("Total pairs are = "+totalPair);
    }
    public static void main(String[] args) {
        int numbers []= {2, 4, 6, 8, 10};
        PrintPairs(numbers);
    }

}
