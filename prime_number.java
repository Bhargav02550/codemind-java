import java.util.Scanner;
class post
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int c=0;
        for(int i=2;i<(int)(n/2);i++)
        {
            if(n%i==0)
            {
                c=1;
            }
        }
        if(c==0)
        {
            System.out.format("prime");
        }
        else
        {
            System.out.format("not a prime");
        }
    }
}