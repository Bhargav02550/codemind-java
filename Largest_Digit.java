import java.util.Scanner;
class solution
{
    public static void main(String args[])
    {
        Scanner s=new Scanner (System.in);
        int n=s.nextInt(),r,l=0;
        while(n>0)
        {
            r=n%10;
            if(l<r)
            {
                l=r;
            }
            n=n/10;
        }
        System.out.format("%d",l);
    }
}