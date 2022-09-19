import java.util.Scanner;
class post
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int[n];
        int k=0;
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        for(int i=n-1;i>=0;i--)
        {
            if(a[i]%2!=0)
            {
                k=i;
                break;
            }
        }
        System.out.format("%d",k);
    }
}