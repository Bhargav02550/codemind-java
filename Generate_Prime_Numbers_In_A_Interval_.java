import java.util.Scanner;
class primes
{
    public static int prime(int num)
    {
        int i;
        if(num==1)
        {
            return 0;
        }
        for(i=2;i<num;i++)
        {
            if(num%i==0)
            {
                return 0;
            }
        }
        return 1;
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int m=0,n=0;
        int a=s.nextInt();
        int b=s.nextInt();
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
        for(int i=m;i<=n;i++)
        {
            if(prime(i)==1)
            {
                System.out.format("%d
",i);
            }
        }
    }
}