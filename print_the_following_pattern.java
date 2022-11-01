import java.util.*;
class solution
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(i==j||j==1||i==n)
                {
                    System.out.format("*");
                }
                else
                {
                    System.out.format(" ");
                }
            }
            System.out.format("
");
        }
    }
}