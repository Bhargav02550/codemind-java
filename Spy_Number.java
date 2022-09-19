import java.util.Scanner;
class solution
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int r=0,p=1;
        while(n!=0)
        {
            r+=n%10;
            p*=n%10;
            n=n/10;
        }
        if(r==p)
        {
            System.out.format("Spy Number");
        }
        else
        {
            System.out.format("Not Spy Number");
        }
    }
}