import java.util.*;
class solution
{
    public static boolean sd(int n)
    {
        int r,c=0,c1=0,t;
        t=n;
        while(n!=0)
        {
            r=n%10;
            n=n/10;
            c++;
            if(r==0)
            {
                break;
            }
            if(t%r==0)
            {
                c1++;
            }
        }
        if(c==c1)
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
        Scanner s=new Scanner (System.in);
        int m=s.nextInt();
        int n=s.nextInt();
        for(int i=m;i<=n;i++)
        {
            if(sd(i))
            {
                System.out.format("%d ",i);
            }
        }
    }
}