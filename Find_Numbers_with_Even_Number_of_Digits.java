import java.util.*;
class solution
{
    public static void main(String args[])
    {
        Scanner s=new Scanner (System.in);
        int n=s.nextInt();
        int[] a=new int[n];
        int k=0,t,c=0;
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
            k=0;
            t=a[i];
            while(t>0)
            {
                t/=10;
                k++;
            }
            if(k%2==0)
            {
                c++;
            }
        }
        System.out.format("%d",c);
    }
}