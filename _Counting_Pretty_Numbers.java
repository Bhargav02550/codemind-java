import java.util.Scanner;
class solution
{
    public static void main(String args[])
    {
        Scanner s=new Scanner (System.in);
        int n=s.nextInt();
        for(int i=0;i<n;i++)
        {
            int a=s.nextInt();
            int b=s.nextInt();
            int c=0;
            for(int j=a;j<=b;j++)
            {
                if(j%10==2 || j%10==3 || j%10==9)
                {
                    c++;
                }
            }
            System.out.format("%d
",c);
        }
    }
}