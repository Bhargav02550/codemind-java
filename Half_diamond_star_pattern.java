import java.util.*;
class solution
{
    public static void main(String args[])
    {
        Scanner s=new Scanner (System.in);
        int n=s.nextInt();
        if(n<3)
        {
            System.out.format("The pattern is not possible");
        }
        else
        {
            for(int i=1;i<=n;i++)
            {
                for(int j=1;j<=i;j++)
                {
                    System.out.format("*");
                }
                System.out.format("
");
            }
            for(int i=n-1;i>=1;i--)
            {
                for(int j=1;j<=i;j++)
                {
                    System.out.format("*");
                }
                System.out.format("
");
            }
        }
    }
}