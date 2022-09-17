import java.util.Scanner;
class ugly
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n,x=0;
        n=s.nextInt();
        while(n!=1)
        {
            if(n%2==0)
            {
                n/=2;
            }
            else if(n%3==0)
            {
                n/=3;
            }
            else if(n%5==0)
            {
                n/=5;
            }
            else
            {
                System.out.format("Not Ugly Number");
                x=1;
                break;
            }
        }
        if(x==0)
        {
            System.out.format("Ugly Number");
        }
    }
}