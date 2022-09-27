import java.util.*;
class solution
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt(),sum=0;
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
            sum+=a[i];
        }
        int avg=sum/n,c=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]>=avg)
            {
                c++;
            }
        }
        System.out.format("%d",c);
    }
}