import java.util.Scanner;
class solution
{
    public static boolean prime(int n)
    {
        if(n<2)
        {
            return false;
        }
        for(int i=2;i<(int)(n/2);i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt(),c=0;
        if(n<2)
        {
            System.out.format("-1");
        }
        for(int i=2;i<n;i++)
        {
            if(prime(i))
            {
                if(n%i==0)
                {
                    c++;
                    System.out.format("%d ",i);
                }
            }
        }
        if(c==0)
        {
            System.out.format("-1");
        }
    }
}