import java.util.Scanner;
class range
{
    public static boolean prime(int num)
    {
        if(num<2)
        {
            return false;
        }
        for(int i=2;i<=(int)Math.sqrt(num);i++)
        {
            if(num%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=0,m=0,n=0;
        if(a<b)
        {
            m=a;
            n=b;
        }
        else
        {
            m=b;
            n=a;
        }
        for(int j=m;j<=n;j++)
        {
            if(prime(j))
            {
                c++;
            }
        }
        System.out.format("%d",c);
    }
}