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
        int c=0,max=0;
        for(int i=0;i<n;i++)
        {
            c=0;
            for(int j=0;j<n;j++)
            {
                if(i!=j && a[i]==a[j])
                {
                    c++;
                }
            }
            if(c==0 && max<a[i])
            {
                max=a[i];
            }
        }
        if(max==0)
        {
            System.out.format("-1");
        }
        else
        {
            System.out.format("%d",max);
        }
    }
}