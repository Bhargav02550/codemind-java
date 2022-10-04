import java.util.*;
class solution
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int[] a=new int[3];
        int[] b=new int[3];
        for(int i=0;i<3;i++)
        {
            a[i]=s.nextInt();
        }
        for(int i=0;i<3;i++)
        {
            b[i]=s.nextInt();
        }
        int c=0,d=0;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(a[i]>b[j] && i==j)
                {
                    c++;
                }
                else if(a[i]<b[j] && i==j)
                {
                    d++;
                }
            }
        }
        System.out.format("%d %d",c,d);
    }
}