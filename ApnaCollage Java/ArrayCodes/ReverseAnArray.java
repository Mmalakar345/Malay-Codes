// write a java code to reverse a array using function method.
package ArrayCodes;

public class ReverseAnArray {

    public static void Reverse(int numbers[]) {
        int first = 0, last = numbers.length - 1;
        while (first < last) {
            // swaping numbers and change there places
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;
            first++;
            last--;
        }
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 5, 8, 9, 11, 7, 12, 17 };
        Reverse(numbers);
        // Print array.
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

    }

}
