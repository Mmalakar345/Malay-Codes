package VariableDataTypes_Operators;

public class TypeCasting2 {
    public static void main(String[] args) {
        // Explecit type casting
        long marks = 50;
        int newMarks = (int) marks; // (int) this symbol allow to type casting & if data is lose then user is the responsible.
        System.out.println(newMarks);

        float number = 20.14f;
        int newNumber = (int) number; // this case data was lose
        System.out.println(newNumber);
    }
    
}
