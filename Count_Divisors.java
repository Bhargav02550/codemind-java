import java.util.Scanner;
class Solution
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int k=s.nextInt();
        int c=0;
        for(int i=a;i<=b;i++)
        {
            if(i%k==0)
            {
                c++;
            }
        }
        System.out.format("%d",c);
    }
}