// writea java program to show Operator example
public class OperetorEX5 {
    public static void main(String args []){
        int x = 10, y = 5;
        int exp1 = (y * (x / y + x / y));
        int exp2 = (y * x / y + y * x / y);
        System.out.println(exp1);
        System.out.println(exp2);
    } 
}

/*
int exp1 = (y * (x / y + x / y));       int exp2 = (y * x / y + y * x / y);

int exp1 = (5 * (10 / 5 + 10 / 5));     int exp2 = (5 * 10 / 5 + 5 * 10 / 5);

int exp1 = (5 * (2 + 2));               int exp2 = (50 / 5 + 50 / 5);

int exp1 = (5 * (4));                   int exp2 = (10 + 10);

int exp1 = (20);                        int exp2 = (20);
 */