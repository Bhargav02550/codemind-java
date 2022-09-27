import java.util.*;
class solution
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int [n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        int m=s.nextInt();
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]<=m)
            {
                c++;
            }
            else
            {
                c+=2;
            }
        }
        System.out.format("%d",c);
    }
}