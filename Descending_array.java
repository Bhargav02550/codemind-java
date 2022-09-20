import java.util.Scanner;
class ascend
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
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(i==n-1)
            {
                break;
            }
            if(a[i]>a[i+1])
            {
                c++;
            }
        }
        if(c==n-1)
        {
            System.out.format("yes");
        }
        else
        {
            System.out.format("no");
        }
    }
}