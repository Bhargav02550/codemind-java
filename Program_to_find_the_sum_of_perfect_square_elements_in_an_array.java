import java.util.*;
class solution
{
    public static boolean fact(int n)
    {
        for(int i=1;i<=n;i++)
        {
            if(n==i*i)
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner (System.in);
        int n=s.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++)
        {
            if(fact(a[i]))
            {
                sum+=a[i];
            }
        }
        System.out.format("%d",sum);
    }
}