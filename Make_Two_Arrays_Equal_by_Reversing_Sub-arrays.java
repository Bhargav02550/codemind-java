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
        Arrays.sort(a);
        int m=s.nextInt();
        int[] b=new int[m];
        for(int j=0;j<m;j++)
        {
            b[j]=s.nextInt();
        }
        Arrays.sort(b);
        int c=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(a[i]==b[j] && i==j)
                {
                    c++;
                }
            }
        }
        if(c==n || c==m)
        {
            System.out.format("True");
        }
        else
        {
            System.out.format("False");
        }
    }
}