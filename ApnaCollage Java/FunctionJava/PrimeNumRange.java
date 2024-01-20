// Write a java program to find automatic a user defined range prime number. Using function method.
public class PrimeNumRange {

    public static boolean isPrime(int n) { // this loop find prime or not
        boolean isPrime = true;
        for (int i=2; i<= n-1; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static void PrimeInRange(int n){ // this loop pass all range value call by isPrime function.
        for(int i=1;i<=n;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();

    }

    public static void main(String[] args) {
        PrimeInRange(20); // method call
    }
}
