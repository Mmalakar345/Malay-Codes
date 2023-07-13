import java.util.Scanner;
class rectangle
{
public static void main(String args[])
{
int len,br,area,peri;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the value of Length :");
len=sc.nextInt();
System.out.println("Enter the value of Length :");
br=sc.nextInt();
area=len*br;
peri=2*(len+br);
System.out.println("Rectangle area is : "+area);
System.out.print("Rectangle Perimeter is : "+peri);
}
}