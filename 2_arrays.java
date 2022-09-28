import java.util.*;
class solution
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int[n];
        int[] b=new int[n];
        int c=0,c1=0,sum=0,sum1=0;
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
            if(a[i]==-1)
            {
                c++;
            }
            else
            {
                sum+=a[i];
            }
        }
        for(int i=0;i<n;i++)
        {
            b[i]=s.nextInt();
            if(b[i]==-1)
            {
                c++;
            }
            else
            {
                sum1+=b[i];
            }
        }
        if(c==2)
        {
            System.out.format("Infinite");
        }
        else
        {
            for(int i=0;i<10000;i++)
            {
                if(i+sum==sum1)
                {
                    c1++;
                }
            }
            System.out.format("%d",c1);
        }
    }
}