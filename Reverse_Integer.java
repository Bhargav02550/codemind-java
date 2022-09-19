import java.util.Scanner;
class post
{
    public static int rev(int num)
    {
        int r=0;
        while(num!=0)
        {
            r=r*10+num%10;
            num=num/10;
        }
        return r;
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=0;
        if(n<0)
        {
            m=n*-1;
        }
        if(n<0)
        {
            System.out.format("-%d",rev(m));
        }
        else
        {
            System.out.format("%d",rev(n));
        }
    }
}