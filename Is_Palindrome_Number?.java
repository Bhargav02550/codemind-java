import java.util.Scanner;
class palindrome
{
    public static int palin(int num)
    {
        int r=0,m;
        m=num;
        while(num!=0)
        {
            r=r*10+num%10;
            num=num/10;
        }
        if(r==m)
        {
            return 2;
        }
        else
        {
            return 1;
        }
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner (System.in);
        int n=s.nextInt();
        System.out.format("%d",palin(n));
    }
}