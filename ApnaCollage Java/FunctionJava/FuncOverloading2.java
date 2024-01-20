// Write a java program to show functioin overloading using type of parameter

public class FuncOverloading2{

    // Function of 2 numbers sum
    public static int sum(int a,int b){
        return a + b;
    }

    // Function of 2 numbers sum
    // same name sum() func allow because use type of parameter different
    public static float sum(float a, float b){ 
        return a + b;
    }


    public static void main(String[] args) {
        //type one
        System.out.println(sum(1, 3));

        //type two
        System.out.println(sum(5.0f,8.9f));
    }

}