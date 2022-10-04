import java.util.*;
class solution
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int p=s.nextInt();
        int t=s.nextInt();
        int r=s.nextInt();
        int in=(p*t*r)/100;
        System.out.format("%d",in);
    }
}