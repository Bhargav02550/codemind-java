import java.util.*;
class solution
{
    public static int min(int[] a)
    {
        int min=a[0],min1=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]<min)
            {
                min=a[i];
                min1=i;
            }
        }
        return min1;
    }
    public static int max(int[] a)
    {
        int max=a[0],max1=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
                max1=i;
            }
        }
        return max1;
    }
    public static boolean prime(int n)
    {
        if(n<2)
        {
            return false;
        }
        for(int i=2;i<(int)(n/2)+1;i++)
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
        Scanner s=new Scanner (System.in);
        int n=s.nextInt();
        int[] a=new int[n];
        int c=0;
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        int mi=min(a),x;
        int ma=max(a),y;
        if(mi<ma)
        {
            x=mi;
            y=ma;
        }
        else
        {
            x=ma;
            y=mi;
        }
        for(int i=x;i<y+1;i++)
        {
            if(prime(a[i]))
            {
                c++;
            }
        }
        System.out.format("%d",c);
    }
}