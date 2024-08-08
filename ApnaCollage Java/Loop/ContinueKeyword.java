
// Write a java code  to show using continue stsatement. 

public class ContinueKeyword {
    public static void main(String[] args) {
       
        for(int i=1; i<10; i++){
            if (i == 7) {
             System.out.println("Skip 7th position");
             continue;    // to skip 7th iteration
            }
            System.out.println("It's ok counter is = "+i); 
         }
    }
}
