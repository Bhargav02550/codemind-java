import java.util.*;
class solution
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=n;j++)
            {
                if(j<=i)
                {
                    System.out.format("%d",j);
                }
            }
            System.out.format("
");
        }
    }
}