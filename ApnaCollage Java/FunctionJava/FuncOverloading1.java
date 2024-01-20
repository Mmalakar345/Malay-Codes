// Write a java program to show functioin overloading using sizing of parameter

public class FuncOverloading1{

    // Function of 2 numbers sum
    public static int sum(int a,int b){
        return a + b;
    }

    // Function of 3 numbers sum
    // same name sum() func allow because use number of parameter different
    public static int sum(int a,int b, int c){ 
        return a + b + c;
    }
    
    public static void main(String[] args) {
        //type one
        System.out.println(sum(1, 3));

        //type two
        System.out.println(sum(5, 8, 9));
    }
}