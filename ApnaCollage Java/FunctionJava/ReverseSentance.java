/*Instructions
Reverse a Sentence.Write a function named reverseSentence that takes a sentence (a string 
containing words separated by spaces) as input and returns the sentence with its words reversed.
Sample Input: "Hello World" 
Sample Output: "olleH dlroW"
*/

public class ReverseSentance {
    public static String reverseSentence(String str){
        String[] arr = str.split(" ");
        String rev="";
        for(int i=0; i<=arr.length-1; i++){
          for(int j=arr[i].length()-1; j>=0; j--){
            rev+=arr[i].charAt(j);
          }
          rev+=" ";
          
        }
        return rev;
      }
    
      public static void main(String[] args){
        String str = "Hello World";
        String val = reverseSentence(str);
        System.out.println(val);
      }
}
