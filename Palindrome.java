import java.util.Scanner;
class solution
{
    public static boolean palindrome(int n)
    {
        int r=0,m=n;
        while(n!=0)
        {
            r=r*10+n%10;
            n=n/10;
        }
        if(m==r)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner (System.in);
        int n=s.nextInt();
        if(palindrome(n))
        {
            System.out.format("True");
        }
        else
        {
            System.out.format("False");
        }
    }
}