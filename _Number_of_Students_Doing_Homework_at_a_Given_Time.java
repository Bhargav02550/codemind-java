import java.util.Scanner;
class home
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a= new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        int n1=s.nextInt();
        int[] a1=new int[n1];
        for(int j=0;j<n1;j++)
        {
            a1[j]=s.nextInt();
        }
        int k=s.nextInt();
        int c=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n1;j++)
            {
                if(a[i]<=k&&a1[j]>=k&&i==j)
                {
                    c++;
                }
            }
        }
        System.out.format("%d",c);
    }
}