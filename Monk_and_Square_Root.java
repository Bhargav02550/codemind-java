import java.util.Scanner;
class solution
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int ans=0;
        for(int j=0;j<n;j++)
        {
        int a=s.nextInt();
        int b=s.nextInt();
        ans=0;
        for(int i=0;i<=b;i++)
        {
            long t=(long)i*i;
            if(t%b==a)
            {
                System.out.format("%d
",i);
                ans=1;
                break;
            }
        }
        if(ans==0)
        {
            System.out.format("-1
");
        }
        }
    }
}