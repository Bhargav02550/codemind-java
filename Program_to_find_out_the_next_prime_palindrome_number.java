import java.util.Scanner;
class solution
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
    public static boolean palindrome(int n)
    {
        int r=0;
        int m=n;
        while(n!=0)
        {
            r=r*10+n%10;
            n=n/10;
        }
        if(m==r)
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
        for(int i=n+1;;i++)
        {
            if(palindrome(i))
            {
                if(prime(i))
                {
                    System.out.format("%d",i);
                    break;
                }
            }
        }
    }
}