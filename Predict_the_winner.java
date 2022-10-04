import java.util.*;
class solution
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        int x=0,y=0;
        for(int i=0;i<n;i++)
        {
            if(i%2==0)
            {
                x+=a[i];
            }
            else
            {
                y+=a[i];
            }
        }
        int c=x-y;
        if(Math.abs(c)%4==0)
        {
            System.out.format("X");
        }
        else
        {
            System.out.format("Y");
        }
    }
}