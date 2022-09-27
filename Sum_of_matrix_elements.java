import java.util.*;
class solutipo
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int m=s.nextInt();
        int n=s.nextInt();
        int[][] a=new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=s.nextInt();
            }
        }
        int sum=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                sum+=a[i][j];
            }
        }
        System.out.format("%d",sum);
    }
}