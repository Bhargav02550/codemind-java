import java.util.*;
class solution
{
    public static void main(String args[])
    {
        Scanner s=new Scanner (System.in);
        int n=s.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        int c=0;
        if(a[0]>a[1])
        {
            for(int i=0;i<n-1;i++)
            {
                if(i%2==0 && a[i]>a[i+1])
                {
                    c++;
                }
                else if(i%2==1 && a[i]<a[i+1])
                {
                    c++;
                }
            }
            if(c==n-1)
            {
                System.out.format("yes");
            }
            else
            {
                System.out.format("no");
            }
        }
        else
        {
            for(int i=0;i<n-1;i++)
            {
                if(i%2==0 && a[i]<a[i+1])
                {
                    c++;
                }
                else if(i%2==1 && a[i]>a[i+1])
                {
                    c++;
                }
            }
            if(c==n-1)
            {
                System.out.format("yes");
            }
            else
            {
                System.out.format("no");
            }
        }
    }
}