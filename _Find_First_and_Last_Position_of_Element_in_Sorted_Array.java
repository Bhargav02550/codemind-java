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
        int k=s.nextInt();
        int c=-1,c1=-1;
        for(int i=0;i<n;i++)
        {
            if(a[i]==k)
            {
                c=i;
                break;
            }
        }
        for(int i=n-1;i>=0;i--)
        {
            if(a[i]==k)
            {
                c1=i;
                break;
            }
        }
        if(c==-1 || c1==-1)
        {
            System.out.format("%d %d",c,c1);
        }
        else
        {
            System.out.format("%d %d",c,c1);
        }
    }
}