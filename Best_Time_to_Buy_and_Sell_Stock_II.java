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
        int c=0;
        for(int i=0;i<n-1;i++)
        {
            if(a[i+1]>a[i])
            {
                c+=a[i+1]-a[i];
            }
        }
        System.out.format("%d",c);
    }
}