import java.util.Scanner;
class solution
{
    public static void main(String args[])
    {
        Scanner s=new Scanner (System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=0;
        for(int i=1;i<=a&&i<=b;i++)
        {
            if(a%i==0 && b%i==0)
            {
                c=i;
            }
        }
        System.out.format("%d",c);
    }
}