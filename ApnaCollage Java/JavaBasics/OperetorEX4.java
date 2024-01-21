// writea java program to show Operator example
public class OperetorEX4 {
    public static void main(String args []){
        int x = 9, y = 12;
        int a = 2, b = 4, c = 6;
        int exp = 4/3 * (x + 34) + 9 * (a + b * c) + (3 + y * (2 + a)) / (a + b*y);
        System.out.println(exp);  
    } 
}

/*
  int exp = 4/3 * (x + 34) + 9 * (a + b * c) + (3 + y * (2 + a)) / (a + b * y);

  int exp = 4/3 * (9 + 34) + 9 * (2 + 4 * 6) + (3 + 12 * (2 + 2)) / (2 + 4 * 12);

  int exp = 4/3 * (43) + 9 * (26) + (3 + y * 4) / (50);

  int exp = 4/3 * (43) + 9 * (26) + (3 + 48) / (50);

  int exp = 4/3 * 43 + 9 * 26 + 51 / 50;

  int exp = 1 * 43 + 234 + 1;

  int exp = 43 + 234 + 1;

  int exp = 278;

 */