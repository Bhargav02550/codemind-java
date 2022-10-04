import java.util.*;
class solution
{
    public static void main(String args[])
    {
        Scanner s=new Scanner (System.in);
        int n=s.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        Arrays.sort(a);
        int c=0;
        for(int k=1;k<n+1;k++)
        {
            c=0;
            for(int i=0;i<n;i++)
            {
                if(a[i]==k)
                {
                    c=1;
                    break;
                }
            }
            if(c==0)
            {
                System.out.format("%d",k);
                break;
            }
        }
    }
}