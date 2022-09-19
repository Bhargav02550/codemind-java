import java.util.Scanner;
class Solution
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        int p=1;
        for(int i=1;i<=b;i++)
        {
            p=p*a;
        }
        System.out.format("%d",p%c);
    }
}