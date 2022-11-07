import java.util.*;
class solution
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if((i==j)||(j==(n-1)-i))
                {
                    System.out.format("x");
                }
                else
                {
                    System.out.format("0");
                }
            }
            System.out.format("
");
        }
    }
}