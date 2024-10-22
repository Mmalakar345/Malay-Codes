// Write a java code to show a linear search model with the help of string type array.

package ArrayCodes;
public class LinearSearchString {

    public static int LinearSearchMenu(String menu[], String word){
        for(int i = 0; i<menu.length; i++){ 
            if(menu[i] == word){ //linear searching 
                return i; // if found then return the index
            }
        }
        return -1; // if not found the elements on the array
    }

    public static void main(String[] args) {
        String menu[] = {"Banana", "Apple","Goyeva", "Mango"};
        String word = "Mango";
        int index = LinearSearchMenu(menu, word); // fuunction call

        if(index == -1){
            System.out.println("Not Found the numbers");
        } else{
            System.out.println("Found the Fruit "+menu[index]+" at "+index+" index");
        }
    }
    
}
