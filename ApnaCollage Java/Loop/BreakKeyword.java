// Write a java code to show break keywortd how it is work.

public class BreakKeyword {
    public static void main(String[] args) {
        for(int i=1; i<10; i++){
           if (i == 7) {
            System.out.println("loop reach 7th position");
            break; // loop terminated
           }
           System.out.println("It's ok counter is = "+i); 
        }
    }
    
}
