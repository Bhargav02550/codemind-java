import java.util.*;
class solution
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt(),c=0,f=0;
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            c=0;
            for(int j=0;j<n;j++)
            {
                if(i!=j && a[i]==a[j])
                {
                    c++;
                }
            }
            if(c==0)
            {
                f=1;
                System.out.format("%d ",a[i]);
            }
        }
        if(f==0)
        {
            System.out.format("-1");
        }
    }
}