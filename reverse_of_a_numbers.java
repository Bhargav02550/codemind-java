import java.util.Scanner;
class revers
{
    public static int plain(int num)
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
        System.out.format("%d",plain(n));
    }
}