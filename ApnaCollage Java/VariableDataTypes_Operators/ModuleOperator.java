package VariableDataTypes_Operators;

public class ModuleOperator {
    public static void main(String[] args) {
        System.out.println(8 % 4); // 8 = 4*2 +0

        System.out.println(10 % 6 );  // 10 = 6*1 + 4

        System.out.println(-10 % 6); //-10 = 6*(-1) + (-4)

        /*
         a % b   range is  {0 to b-1}  when a>0, b>0 means posetive value

         b = 6 then 
         0 % 6 = 0      6 % 6 = 0       12 % 6 = 0
         1 % 6 = 1      7 % 6 = 1       13 % 6 = 1
         2 % 6 = 2      8 % 6 = 2       14 % 6 = 2
         3 % 6 = 3      9 % 6 = 3       15 % 6 = 3
         4 % 6 = 4      10 % 6 = 4      16 % 6 = 4
         5 % 6 = 5      11 % 6 = 5      17 % 6 = 5

         the range lie to [0 to (b - 1= 5)]
         */

         /*
          any number 1254 % 10 get last digit
          any num 154254 / 10 get 15425 last digit remove 
          only use int variables
          */
    }
    
}
