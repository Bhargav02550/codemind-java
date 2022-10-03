import java.util.*;
class solution
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        while(n-->0)
        {
            int m=s.nextInt();
            int[] a=new int[m];
            for(int i=0;i<m;i++)
            {
                a[i]=s.nextInt();
            }
            int c=0;
            for(int k=1;k<m;k++)
            {
                if(a[k-1]>a[k])
                {
                    c++;
                }
            }
            if(c==0)
            {
                System.out.format("%d",c);
            }
            else
            {
                int max=a[0],min=a[0];
                for(int l=0;l<m;l++)
                {
                    if(min>a[l])
                    {
                        min=a[l];
                    }
                    if(max<a[l])
                    {
                        max=a[l];
                    }
                }
                System.out.format("%d
",max-min);
            }
        }
    }
}