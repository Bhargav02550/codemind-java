import java.util.*;
class solution
{
    public static void main(String args[])
    {
        Scanner s=new Scanner (System.in);
        int n=s.nextInt();
        int [] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        int max=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int d=a[j]-a[i];
                if(d>max)
                {
                    max=d;
                }
            }
        }
        System.out.format("%d",max);
    }
}