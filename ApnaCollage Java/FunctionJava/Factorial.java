// Write java program to find the factorial of a number using function method.
public class Factorial{

    public static int factorial(int m){
        int f=1;
        for(int i=1;i<=m;i++){
            f=i*f;
        }
        return f;
    }
    public static void main(String[] args) {
        //type one
        System.out.println("Factorial of 5 is = "+factorial(5));

        //type two
        int fact=factorial(10);
        System.out.println("Factorial of 10 is = "+fact);
    }
}