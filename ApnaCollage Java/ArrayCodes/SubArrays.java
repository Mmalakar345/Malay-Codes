// Write a java code to show a sub array
/* input = {2, 3, 5}
output = 
2 
2 3 
2 3 5 

3 
3 5 

5 
 */
package ArrayCodes;

public class SubArrays {

    public static void PrintSubArray(int numbers[]){
        for(int i = 0; i<numbers.length; i++){
            int start = i;
            for(int j = i; j<numbers.length; j++){
                int end = j;
                for(int k = start; k<=end; k++){
                    System.out.print(numbers[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int numbers[] = {2, 3, 5};
        PrintSubArray(numbers);
    }
    
}
