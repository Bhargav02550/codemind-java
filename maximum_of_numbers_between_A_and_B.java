import java.util.Scanner;
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
        int c=s.nextInt();
        int d=s.nextInt();
        int max=a[0],r=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]>max && a[i]>=c && a[i]<=d)
            {
                max=a[i];
                r++;
            }
        }
        if(r==0)
        {
            System.out.format("-1");
        }
        else
        {
            System.out.format("%d",max);
        }
    }
}