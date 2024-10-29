package VariableDataTypes_Operators;

public class Plus_Operators {
    public static void main(String[] args) {
        System.out.println(10 + 12); // act as addition operator - Integer addition
        System.out.println(3.0 + 2); // act as addition operator - double addition
        System.out.println("3.0 + 2"); // consider as character

        System.out.println("3.0 " + " 2"); // concatination two string
        System.out.println("3.0 " + " " + " 2"); // concatination two string
        System.out.println("3.0 " + " " + " 2"); // concatination two string
        System.out.println("3.0 " + " m"); // concatination two string


        System.out.println("15" + "30"); // concatination
        System.out.println("15" + 30);  // string + int = final answer  concatination
        System.out.println(15 + "30"); // int + string = final answer  concatination 
        System.out.println(15 + 30 + "15 + 30" + 15 +30);
        // java run code top to buttom and left to right
        // so 15+30= 45 and all concatination
        // 4515 + 301530

    }
}
