import java.util.*;
class solution
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-2;j++)
            {
                System.out.format("%d",j);
            }
            for(int k=1;k<=n-3;k++)
            {
                System.out.format("%d",k);
            }
            System.out.format("
");
        }
    }
}