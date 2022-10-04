import java.util.*;
class solution
{
    public static int fact(int n)
    {
        int f=1;
        for(int i=2;i<=n;i++)
        {
            f*=i;
        }
        return f;
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        while(n-->0)
        {
            int a=s.nextInt();
            System.out.format("%d
",fact(a));
        }
    }
}