import java.util.*;
class solution
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt(),c=0;
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i!=j && a[i]==a[j] && a[i]!=0 && a[j]!=0)
                {
                    c++;
                    a[i]=0;
                    a[j]=0;
                }
            }
        }
        System.out.format("%d",c);
    }
}