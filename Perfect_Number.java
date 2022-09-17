import java.util.Scanner;
class per
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int s1=0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                s1+=i;
            }
        }
        if(s1==n)
        {
            System.out.format("True");
        }
        else
        {
            System.out.format("False");
        }
    }
}