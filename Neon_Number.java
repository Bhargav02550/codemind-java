import java.util.Scanner;
class solution
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=n*n,r=0;
        while(m!=0)
        {
            r+=m%10;
            m=m/10;
        }
        if(r==temp)
        {
            System.out.format("Neon Number");
        }
        else
        {
            System.out.format("Not Neon Number");
        }
    }
}