// Write a java program to find a number is prime or not - using function method. 
// Optimized code

public class PrimeNumberOptimizez {

    public static boolean Isprime(int n){
        if (n == 2){
            return true;
        }

        for(int i = 2; i<Math.sqrt(n); i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(Isprime(12));
    }
    
}

// true == prime number
// false == not prime number