import java.util.Scanner;
class oddsum
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
        int c=0,sum=0;
        for(int i=0;i<n;i++)
        {
            c=0;
            for(int j=i;j<n;j++)
            {
                if(a[i]==a[j])
                {
                    c++;
                }
            }
            if(c==1 && a[i]%2!=0)
            {
                sum+=a[i];
            }
        }
        System.out.format("%d",sum);
    }
}