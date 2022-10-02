import java.util.*;
class solutin
{
    public static void main(String args[])
    {
        Scanner s=new Scanner (System.in);
        int n=s.nextInt();
        int[] a=new int [n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        int c=0;
        int k=s.nextInt();
        for(int i=0;i<n;i++)
        {
            if(a[i]==k)
            {
                c=i;
                break;
            }
        }
        if(c==0)
        {
            System.out.format("-1");
        }
        else
        {
            System.out.format("%d",c);
        }
    }
}