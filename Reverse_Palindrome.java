import java.util.*;
class solution
{
    public static int rev(int n)
    {
        int s=0;
        while(n!=0)
        {
            s=s*10+n%10;
            n=n/10;
        }
        return s;
    }
    public static boolean palin(int n)
    {
        int t;
        t=n;
        if(rev(n)==t)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        while(n!=0)
        {
            int r=rev(n);
            n=n+r;
            if(palin(n))
            {
                System.out.format("%d",n);
                break;
            }
        }
    }
}