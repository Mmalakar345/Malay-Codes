// Write a java program to find a number is prime or not using function method.
public class PrimeNumberFind {

    public static boolean isPrime(int n) {
        boolean isPrime = true;
        for (int i=2; i<= n-1; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static void main(String[] args) {
        boolean value = isPrime(12);
        if(value == false){
        System.out.println("It is not a prime number");
        }
        else{
        System.out.println("It is a prime number");
        }
        System.out.println(isPrime(11));
    }  
}
