#include <stdio.h>

int main(int argc, char const *argv[])
{
    int a = 8;
    float b = 7.333;
    printf("The value of a is %d and the value of b is %f\n", a, b);

    int c = 9;
    float d = 1.2;
    printf("The value of c is %d and the value of d is %15f\n", c, d);
   
    int g = 55;
    float h = 3.5;
    printf("The value of g is %d and the value of h is %10f\n", g, h);

    int j = 44;
    float k = 5.5;
    printf(" % -10f   MALAY MALAKAR\n", k);

    int m = 55;
    float n = 3.5;
    long  o = 54;
    double p = 8.2;
    char  q = 5.6;
    long double r = 11;
    printf(" %d %f %e %lf %c %LF\n", m, n, o, p, q, r);

    return 0;
}
