import java.util.Scanner;
class digits
{
    public static int p(int n)
    {
        int i;
        for(i=2;i<=(n/2)+1;i++)
        {
           if(n%i==0)
            {
               return 0;
            }
        }
        return 1;
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        int k=s.nextInt();
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(p(a[i])==1&&a[i]<=k)
            {
                c++;
            }
        }
        System.out.format("%d",c);
    }
}