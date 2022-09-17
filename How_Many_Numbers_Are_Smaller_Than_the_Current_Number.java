import java.util.Scanner;
class current
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n,k,c=0;
        n=s.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            k=a[i];
            c=0;
            for(int j=0;j<n;j++)
            {
                if(k>a[j])
                {
                    c++;
                }
            }
            System.out.format("%d ",c);
        }
    }
}