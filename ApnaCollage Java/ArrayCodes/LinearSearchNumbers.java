
// Write a java code to show a linear search model with the help of integer type array.

package ArrayCodes;
public class LinearSearchNumbers {

    public static int LinearSearchNumber(int numbers[], int key){
        for(int i = 0; i<numbers.length; i++){
            if(numbers[i] ==key){  //linear searching 
                return i; // if found then return the index
            }
        }
        return -1; // if not found the elements on the array
    }


    public static void main(String[] args) {
        int numbers[] = {2, 3, 8, 9, 10, 75, 1, 11};
        int key = 10;
        int index = LinearSearchNumber(numbers, key);  // fuunction call

        if(index == -1){
            System.out.println("Not Found the numbers");
        } else{
            System.out.println("Found the numbers at "+index+" index");
        }
    
    } 
}
