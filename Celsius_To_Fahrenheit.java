import java.util.*;
class solution
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        double f=(float)(a*1.8);
        double c=f+32;
        System.out.format("%.2f",c);
    }
}