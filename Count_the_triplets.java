import java.util.*;
class solution
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int m=s.nextInt();
        for(int t=0;t<m;t++)
        {
            int n=s.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++)
            {
                a[i]=s.nextInt();
            }
            int c=0;
            for(int i=0;i<n;i++)
            {
                for(int j=i+1;j<n;j++)
                {
                    for(int k=0;k<n;k++)
                    {
                        if(a[i]+a[j]==a[k] && k!=j)
                        {
                            c++;
                        }
                    }
                }
            }
            if(c==0)
            {
                System.out.format("-1
");
            }
            else
            {
                System.out.format("%d
",c);
            }
        }
    }
}