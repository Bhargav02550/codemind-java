import java.util.Scanner;
class cap
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        System.out.format("%d",a*b*c*512*2);
    }
}