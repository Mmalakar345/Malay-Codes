/*    Write java program to show a number's Binomial coefficient using function method.
formula = n factorial / k factorial * (n - k) factorial.
input n = 5, k = 2.
output = 10.  */

public class BinomialCoeffiicent{

    public static int factorial(int m){ // find factorial method
        int f=1;
        for(int i=1;i<=m;i++){
            f=i*f;
        }
        return f;
    }

    public static int Binomial(int n,int k){
        int n_fact =factorial(n); // function call (n)! factorial
        int k_fact =factorial(k); // function call (k)! factorial
        int c_fact =factorial(n-k); // function call (n-k)! factorial

        int bincoeff = n_fact / (k_fact * c_fact);
        return bincoeff;
    }


    public static void main(String[] args) { // main method
        System.out.println(Binomial(5,2));; // function call 
    }

}