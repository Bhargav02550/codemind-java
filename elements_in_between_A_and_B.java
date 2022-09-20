import java.util.Scanner;
class character
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
        int sum=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]>=c && a[i]<=d)
            {
                System.out.format("%d ",a[i]);
                sum++;
            }
        }
        if(sum==0)
        {
            System.out.format("-1");
        }
    }
}