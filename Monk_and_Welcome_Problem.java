import java.util.*;
class solution
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        int[] b=new int[n];
        for(int i=0;i<n;i++)
        {
            b[i]=s.nextInt();
        }
        int[] sum=new int[n];
        for(int i=0;i<n;i++)
        {
            sum[i]=a[i]+b[i];
            System.out.format("%d ",sum[i]);
        }
    }
}