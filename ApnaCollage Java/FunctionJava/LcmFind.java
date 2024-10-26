import java.util.Scanner;

public class LcmFind {
    public static void L_c_mFind(int num1, int num2, int num3) {
        // Maximum find
        int maximum = 0;
        if (num1 > num2 && num1 > num3) {
            maximum = num1;
        } else if (num2 > num1 && num2 > num3) {
            maximum = num2;
        } else {
            maximum = num3;
        }
        System.out.println("Maximum Number is = " +maximum);

        // LCM find
        int LCM = 0;
        while (true) {
            if (maximum%num1 == 0 &&  maximum%num2  == 0 && maximum%num3 == 0) {
                LCM = maximum;
                break;
            } else {
                    maximum = maximum + 1;
            }
        }
        System.out.println("Least Common Multiple is = "+LCM);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your First number = ");
        int num1 = sc.nextInt();
        System.out.print("Enter Your First number = ");
        int num2 = sc.nextInt();
        System.out.print("Enter Your First number = ");
        int num3 = sc.nextInt();

        L_c_mFind(num1, num2, num3);
    }

}
