import java.util.*;
class solution
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<i;j++)
            {
                System.out.printf(" ");
            }
            for(int k=1;k<=n;k++)
            {
                if(i==1 || i==n || k==1 ||k==n)
                {
                    System.out.printf("*");
                }
                else
                {
                    System.out.printf(" ");
                }
            }
            System.out.printf("
");
        }
    }
}