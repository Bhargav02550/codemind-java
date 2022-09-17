import java.util.Scanner;
class area
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        double a=s.nextDouble();
        double b=s.nextDouble();
        double c=s.nextDouble();
        double d=(a+b+c)/2;
        double a1=Math.sqrt(d*(d-a)*(d-b)*(d-c));
        System.out.format("%.2f",a1);
    }
}