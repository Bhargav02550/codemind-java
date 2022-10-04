import java.util.Scanner;
class count
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int f=s.nextInt();
        double c=(float)((f-32)/1.8);
        System.out.format("%.2f",c);
    }
}