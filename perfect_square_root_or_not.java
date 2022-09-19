import java.util.Scanner;
class post
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int c=0;
        for(int i=1;i<n;i++)
        {
            if(i*i==n)
            {
                c=1;
                break;
            }
        }
        if(c==1)
        {
            System.out.format("True");
        }
        else
        {
            System.out.format("False");
        }
    }
}