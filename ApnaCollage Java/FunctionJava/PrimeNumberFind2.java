// Write a java program to find a number is prime or not - using function method.
public class PrimeNumberFind2 {

    public static boolean isPrime(int n) {
        for (int i=2; i<= n-1; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        boolean value = isPrime(3);
        if(value == false){
        System.out.println("It is not a prime number");
        }
        else{
        System.out.println("It is a prime number");
        }
        System.out.println(isPrime(3));
    }  
}
