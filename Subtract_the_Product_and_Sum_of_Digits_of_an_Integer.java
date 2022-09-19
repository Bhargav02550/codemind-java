import java.util.Scanner;
class Solution
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a=0,p=1;
        while(n!=0)
        {
            a+=n%10;
            p*=n%10;
            n=n/10;
        }
        System.out.format("%d",Math.abs(a-p));
    }
}